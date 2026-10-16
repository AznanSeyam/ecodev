package com.ecommerce.store;

import org.springframework.stereotype.Service;

@Service
public class PaypalService implements PaymentService {
    @Override 
    public void paymentDone(){
        System.out.println("paypal payment done!");
    }

}
