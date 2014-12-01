package com.axiata.dialog.mss;

import com.axiata.dialog.dao.SignatureDao;
import com.axiata.dialog.dao.SignatureDaoImpl;
import com.axiata.dialog.model.MSSRequest;
import com.axiata.dialog.model.MSSResponse;
import com.axiata.dialog.model.MssSignatureLog;
import com.axiata.dialog.util.Config;
import es.telefonica.mobileconnect.MSS_Signature;
import es.telefonica.mobileconnect.MSS_SignatureResponse;
import mobileconnect.telefonica.es.MSS_SignatureServiceStub;
import org.apache.axis2.databinding.types.NCName;
import org.apache.axis2.databinding.types.PositiveInteger;
import org.apache.axis2.databinding.types.URI;
import org.apache.log4j.Logger;
import org.etsi.uri.ts102204.v1_1_2.*;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.*;


/**
 * Created by nilan on 11/20/14.
 */
public class MSSSoapWebServiceImpl implements MSSSoapWebService{

   final static Logger log = Logger.getLogger(MSSSoapWebServiceImpl.class);

   @Override
   public MSSResponse signatureService(MSSRequest mssRequest){

       MSSResponse response=new MSSResponse();
       SignatureDao signatureDao=new SignatureDaoImpl();
       MssSignatureLog mssSignatureLog=new MssSignatureLog();
       response.setResponseStatus(Config.getInstance().getProperty("mss.signature.response.fail.status"));
      try {
            MSS_SignatureServiceStub stub=new MSS_SignatureServiceStub(Config.getInstance().getProperty("mss.signature.service.request.url"));
            MSS_SignatureReqType mssSignatureReqType=new MSS_SignatureReqType();

            MSS_Signature mssSignature=new MSS_Signature();
            mssSignatureReqType.setMajorVersion(new BigInteger("1"));
            mssSignatureReqType.setMinorVersion(new BigInteger("1"));
            PositiveInteger positiveInteger=new PositiveInteger(Config.getInstance().getProperty("mss.signature.service.timeout"));
            mssSignatureReqType.setTimeOut(positiveInteger);
            if(Config.getInstance().getProperty("mss.signature.service.messaging.mode.type").equalsIgnoreCase("asynchServerServer"))
            {
            mssSignatureReqType.setMessagingMode(MessagingModeType.asynchServerServer);
            }

            Calendar cal = Calendar.getInstance();
            DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
            Date validitidate = formatter.parse("12/29/14");
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(validitidate);
            mssSignatureReqType.setValidityDate(calendar1);

            AP_Info_type0 apInfo=new AP_Info_type0();
            URI uri=new URI(Config.getInstance().getProperty("mss.signature.service.ap.id"));
            URI appuri=new URI(Config.getInstance().getProperty("mss.signature.service.response.url"));
            apInfo.setAP_ID(uri);
            apInfo.setAP_PWD(Config.getInstance().getProperty("mss.signature.service.ap.pwd"));
            apInfo.setAP_URL(appuri);
            NCName nc=new NCName();
            String apNo=(cal.getTime().getYear()+1900)+""+(cal.getTime().getMonth()+1)+""+cal.getTime().getDate();
            apNo="_"+""+apNo+""+signatureDao.getDalyCount("_"+apNo);
            nc.setValue(apNo);
            apInfo.setAP_TransID(nc);

            apInfo.setInstant(calendar1);
            mssSignatureReqType.setAP_Info(apInfo);

            MSSP_Info_type0 mssp_info_type=new MSSP_Info_type0();
            URI msspuri=new URI(Config.getInstance().getProperty("mss.signature.service.mssp.info.type"));
            MeshMemberType meshMemberType=new MeshMemberType();
            meshMemberType.setURI(msspuri);
            mssp_info_type.setMSSP_ID(meshMemberType);
            mssSignatureReqType.setMSSP_Info(mssp_info_type);

            MobileUserType mobileUserType=new MobileUserType();
            mobileUserType.setMSISDN(mssRequest.getMsisdnNo());
            mssSignatureReqType.setMobileUser(mobileUserType);

            DataType dataType=new DataType();
            dataType.setMimeType(Config.getInstance().getProperty("mss.signature.service.data.type.mime.type"));
            dataType.setEncoding(Config.getInstance().getProperty("mss.signature.service.data.type.encoding"));
            dataType.setString(Config.getInstance().getProperty("mss.signature.service.data.type.string"));
            mssSignatureReqType.setDataToBeSigned(dataType);

            MssURIType mssURIType=new MssURIType();
            URI mssuritype=new URI(Config.getInstance().getProperty("mss.signature.service.signature.profile.url"));
            mssURIType.setMssURI(mssuritype);
            System.out.println(mssuritype);
            mssSignatureReqType.setSignatureProfile(mssURIType);

            MssURIType mssURIType1=new MssURIType();
            URI mssuritypeformat=new URI(Config.getInstance().getProperty("mss.signature.service.mss.format.url"));
            mssURIType1.setMssURI(mssuritypeformat);
            mssSignatureReqType.setMSS_Format(mssURIType1);

            mssSignature.setMSS_SignatureReq(mssSignatureReqType);

             try {
                System.out.println(mssSignature);
                MSS_SignatureResponse res=stub.mSS_Signature(mssSignature);

                res.getMSS_SignatureResp().getStatus().getStatusCode().getStatusCode();
                BigInteger resId=res.getMSS_SignatureResp().getStatus().getStatusCode().getValue();

                mssSignatureLog.setApTranceId(apNo);
                mssSignatureLog.setMsisdn(mssRequest.getMsisdnNo());
                mssSignatureLog.setReaStatus(resId);
                mssSignatureLog.setRespStatus(new BigInteger(Config.getInstance().getProperty("mss.signature.response.fail.status")));
                mssSignatureLog.setReqTime(cal.getTime());
                mssSignatureLog.setRespTime(cal.getTime());
                mssSignatureLog.setDescription(res.getMSS_SignatureResp().getStatus().getStatusMessage());
                signatureDao.addSignatureLog(mssSignatureLog);
               //get notify  response
                 MSSResp mssResp=new MSSResp(apNo);
                 FutureTask<String> futureTask = new FutureTask<String>(mssResp);
                 ExecutorService executor = Executors.newFixedThreadPool(1);
                 executor.execute(futureTask);
                 String futureOut=Config.getInstance().getProperty("mss.signature.response.fail.status");

                 while (true) {
                     try {
                         if (futureTask.isDone()) {
                             executor.shutdown();
                             break;
                         }
                         futureOut = futureTask.get(200L, TimeUnit.MILLISECONDS);
                         if (futureOut != null) {
                             System.out.println("FutureTask output=" +futureOut);
                         }
                     } catch (InterruptedException e) {
                         log.error("Exception :"+e.getMessage());
                     } catch (TimeoutException e) {

                     }catch(ExecutionException e){

                         log.error("Exception :"+e.getMessage());

                     }
                 }
                 if(futureOut.equalsIgnoreCase(Config.getInstance().getProperty("mss.signature.response.success.status"))){
                     response.setResponseStatus(resId.toString());
                 }else{
                     response.setResponseStatus(Config.getInstance().getProperty("mss.signature.response.fail.status"));

                 }


             } catch (RemoteException e) {

                 mssSignatureLog.setApTranceId(apNo);
                 mssSignatureLog.setMsisdn(mssRequest.getMsisdnNo());
                 mssSignatureLog.setRespStatus(new BigInteger(Config.getInstance().getProperty("mss.signature.response.fail.status")));
                 mssSignatureLog.setReaStatus(new BigInteger(Config.getInstance().getProperty("mss.signature.response.fail.status")));
                 mssSignatureLog.setDescription(e.getMessage());
                 mssSignatureLog.setReqTime(cal.getTime());
                 mssSignatureLog.setRespTime(cal.getTime());
                 signatureDao.addSignatureLog(mssSignatureLog);
                 response.setMsisdnNo(mssRequest.getMsisdnNo());
                 response.setResponseStatus(Config.getInstance().getProperty("mss.signature.response.fail.status"));

                 log.error("Remote Web Service Exception :"+e.getMessage());

             }
        }
        catch(Exception ex){

            log.error("Exception :"+ex.getMessage());

        }




        return response;
    }


}
