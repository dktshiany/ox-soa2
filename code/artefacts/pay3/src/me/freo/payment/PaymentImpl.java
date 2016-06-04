
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package me.freo.payment;

import java.util.Random;
import java.util.UUID;
import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-06-01T09:42:56.556+01:00
 * Generated source version: 2.7.18
 * 
 */

@javax.jws.WebService(
                      serviceName = "payment",
                      portName = "paymentSOAP",
                      targetNamespace = "http://freo.me/payment/",
                      wsdlLocation = "./payment.wsdl",
                      endpointInterface = "me.freo.payment.Payment")
                      
public class PaymentImpl implements Payment {

    private static final Logger LOG = Logger.getLogger(PaymentImpl.class.getName());

    /* (non-Javadoc)
     * @see me.freo.payment.Payment#authorise(me.freo.payment.CardType  card ,)int  merchant ,)java.lang.String  reference ,)double  amount ,)java.lang.String  authcode ,)java.lang.Integer  resultcode ,)java.lang.String  refusalreason )*
     */
    public void authorise(me.freo.payment.CardType card,int merchant,javax.xml.ws.Holder<java.lang.String> reference,double amount,javax.xml.ws.Holder<java.lang.String> authcode,javax.xml.ws.Holder<java.lang.Integer> resultcode,javax.xml.ws.Holder<java.lang.String> refusalreason) { 
    	LOG.info("Executing operation authorise");
        System.out.println(card);
        System.out.println(merchant);
        System.out.println(reference.value);
        System.out.println(amount);
        Random rand = new Random();
        boolean success = rand.nextBoolean();
        if (success) {
            java.lang.String authcodeValue = "AUTH0234";
            authcode.value = authcodeValue;
            java.lang.Integer resultcodeValue = 0;
            resultcode.value = resultcodeValue;
            java.lang.String refusalreasonValue = "OK";
            refusalreason.value = refusalreasonValue;
        } 
        else 
        {
        	authcode.value = "FAILED";
        	resultcode.value = 100; 
        	refusalreason.value = "INSUFFICIENT FUNDS";

        }
    	reference.value = UUID.randomUUID().toString();		
    }

}
