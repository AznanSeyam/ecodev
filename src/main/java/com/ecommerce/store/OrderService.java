package com.ecommerce.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service 
public class OrderService {

    
    private PaymentService paymentService;

    public OrderService( @Qualifier("Paypal") PaymentService paymentService) {
        this.paymentService=paymentService;
    }

    public void paymentOk(){
        paymentService.paymentDone();;
    }
}
