package com.ecommerce.store;

import org.springframework.stereotype.Service;

@Service 
public class OrderService {

    
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService=paymentService;
    }

    public void paymentOk(){
        paymentService.paymentDone();;
    }
}