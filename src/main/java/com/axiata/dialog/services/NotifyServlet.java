package com.axiata.dialog.services;

import com.axiata.dialog.dao.SignatureDao;
import com.axiata.dialog.dao.SignatureDaoImpl;
import com.axiata.dialog.model.MssSignatureLog;
import org.apache.log4j.Logger;
import org.w3c.dom.NodeList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPMessage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Calendar;

/**
 * Created by nilan on 11/28/14.
 */
public class NotifyServlet extends HttpServlet {

    final static Logger log = Logger.getLogger(NotifyServlet.class);

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        System.out.print("============NotifyServlet============");
        String br = request.getReader().readLine();
        System.out.println(br);
        SignatureDao signatureDao=new SignatureDaoImpl();


try {
    MessageFactory factory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
    SOAPMessage message = factory.createMessage(null,new ByteArrayInputStream(br.getBytes(Charset.forName("UTF-8"))));

    SOAPBody body = message.getSOAPBody();
    NodeList nodes=body.getFirstChild().getFirstChild().getChildNodes();

    String mssp=nodes.item(1).getFirstChild().getTextContent();
    String statusCode=nodes.item(2).getFirstChild().getAttributes().item(0).getNodeValue();
    String description=nodes.item(2).getFirstChild().getNextSibling().getFirstChild().getTextContent();

   //this is only for testing Plz remove ths on live
    System.out.println("============MSSP============"+mssp);
    System.out.println("============Status=========="+statusCode);

    System.out.println("============Description====="+description);
    log.debug("============MSSP============"+mssp);
    log.debug("============Status=========="+statusCode);

    MssSignatureLog mssSignatureLog =new MssSignatureLog();
    mssSignatureLog.setMsisdn(mssp);
    BigInteger statusCodeBI=new BigInteger(statusCode);
    mssSignatureLog.setRespStatus(statusCodeBI);
    mssSignatureLog.setRespDescription(description);
    Calendar calendar = Calendar.getInstance();
    mssSignatureLog.setRespTime(calendar.getTime());
    signatureDao.editSignatureLog(mssSignatureLog);


      }catch(Exception ex){

     log.error("NotifyServlet Exception :"+ex);


    }


  }






}
