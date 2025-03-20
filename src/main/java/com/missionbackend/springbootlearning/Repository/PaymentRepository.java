package com.missionbackend.springbootlearning.Repository;

import com.missionbackend.springbootlearning.DTO.PaymentRequest;
import com.missionbackend.springbootlearning.Entity.PaymentEntity;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {

    public PaymentEntity getPaymentById(PaymentRequest request){
        PaymentEntity paymentModel = executeQuery(request);
        return paymentModel;
    }
    private PaymentEntity executeQuery(PaymentRequest request){
        PaymentEntity payment = new PaymentEntity();
        payment.setId(request.getPaymentId());
        payment.setPaymentCurrency("INR");
        payment.setPaymentAmount(100.00);
        return payment;
    }
}
