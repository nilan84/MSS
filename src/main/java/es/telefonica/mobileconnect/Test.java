package es.telefonica.mobileconnect;

import com.axiata.dialog.util.Config;
import mobileconnect.telefonica.es.MSS_SignatureServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.databinding.types.NCName;
import org.apache.axis2.databinding.types.PositiveInteger;
import org.apache.axis2.databinding.types.URI;
import org.etsi.uri.ts102204.v1_1_2.*;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {




	  public static void main(String arge[]){


          ;
          //get the property value and print it out
          System.out.println((Config.getInstance().getProperty("msssignature.service.url")));
		
		
		System.out.println("abc");
		try {
			MSS_SignatureServiceStub stub=new MSS_SignatureServiceStub();
			//MSS_S 
			MSS_SignatureReqType sig=new MSS_SignatureReqType();
            System.out.println("abc1");
			MSS_Signature sig1=new MSS_Signature();
            sig.setMajorVersion(new BigInteger("1"));
            sig.setMinorVersion(new BigInteger("1"));
            PositiveInteger positiveInteger=new PositiveInteger("80");
            sig.setTimeOut(positiveInteger);
         // MessagingModeType.asynchServerServer
            sig.setMessagingMode(MessagingModeType.asynchServerServer);

            DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
            Date validitidate = formatter.parse("12/29/14");
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(validitidate);
            sig.setValidityDate(calendar1);
            AP_Info_type0 apInfo=new AP_Info_type0();
            URI uri=new URI("10");
            URI appuri=new URI("http://localhost:18080/notify");

            apInfo.setAP_ID(uri);
            apInfo.setAP_PWD("test");
            apInfo.setAP_URL(appuri);
            NCName nc=new NCName();
            nc.setValue("_20141218903216");
            apInfo.setAP_TransID(nc);

            Date date = formatter.parse("12/29/14");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            apInfo.setInstant(calendar);


            sig.setAP_Info(apInfo);

            MSSP_Info_type0 mssp_info_type=new MSSP_Info_type0();
            URI msspuri=new URI("http://mssp.telefonica.es/");
            MeshMemberType meshMemberType=new MeshMemberType();
            meshMemberType.setURI(msspuri);
            mssp_info_type.setMSSP_ID(meshMemberType);

            sig.setMSSP_Info(mssp_info_type);

            MobileUserType mobileUserType=new MobileUserType();
            mobileUserType.setMSISDN("+34650416145");
            sig.setMobileUser(mobileUserType);

            DataType dataType=new DataType();
            dataType.setMimeType("text/plain");
            dataType.setEncoding("7bit");

            dataType.setString("TEXT_TO_BE_SIGNED");
            sig.setDataToBeSigned(dataType);

            MssURIType mssURIType=new MssURIType();
            //<v1:mssURI>http://uri.gsma.com/mobileconnect/LoA3/CBCMAC3DES</v1:mssURI>
            URI mssuritype=new URI("http://uri.gsma.com/mobileconnect/LoA3/CBCMAC3DES".trim());
            mssURIType.setMssURI(mssuritype);
            System.out.println(mssuritype);
            sig.setSignatureProfile(mssURIType);

            MssURIType mssURIType1=new MssURIType();
            URI mssuritypeformat=new URI("http://uri.etsi.org/TS102204/v1.1.2#PKCS7");
            mssURIType1.setMssURI(mssuritypeformat);
            sig.setMSS_Format(mssURIType1);

            System.out.println("abc2");
		    sig1.setMSS_SignatureReq(sig);




			try {
                System.out.println(sig1);
				MSS_SignatureResponse res=stub.mSS_Signature(sig1);

				res.getMSS_SignatureResp().getStatus().getStatusCode().getStatusCode();
				System.out.println("Status:"+res.getMSS_SignatureResp().getStatus().getStatusCode().getValue());
                System.out.println("StatusMessage"+res.getMSS_SignatureResp().getStatus().getStatusMessage());
				
			} catch (RemoteException e2) {
				// TODO Auto-generated catch block
                System.out.print(e2.getMessage());
				e2.printStackTrace();
			}
			

			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URI.MalformedURIException e) {
            e.printStackTrace();
        }
          catch(Exception ex){
              ex.printStackTrace();
          }

      }
	
}
