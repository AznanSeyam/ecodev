package com.ecommerce.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

 @Service("Stripe")
 @Primary 
public class StripeService implements PaymentService {

    @Override 
    public void paymentDone(){
        System.out.println("stripe payment done!");
    }
}