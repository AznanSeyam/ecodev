package com.ecommerce.store;

import org.springframework.stereotype.Service;

 
public class StripeService implements PaymentService {

    @Override 
    public void paymentDone(){
        System.out.println("stripe payment done!");
    }
}