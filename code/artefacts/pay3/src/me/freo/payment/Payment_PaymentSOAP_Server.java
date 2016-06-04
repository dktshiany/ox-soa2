
package me.freo.payment;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-06-01T09:42:56.598+01:00
 * Generated source version: 2.7.18
 * 
 */
 
public class Payment_PaymentSOAP_Server{

    protected Payment_PaymentSOAP_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new PaymentImpl();
        System.out.println(implementor);
        String address = "http://localhost:8000/payment";
        System.out.println(address);

        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new Payment_PaymentSOAP_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 10000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
