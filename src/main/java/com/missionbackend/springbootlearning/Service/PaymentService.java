package com.missionbackend.springbootlearning.Service;

import com.missionbackend.springbootlearning.DTO.PaymentRequest;
import com.missionbackend.springbootlearning.DTO.PaymentResponse;
import com.missionbackend.springbootlearning.Entity.PaymentEntity;
import com.missionbackend.springbootlearning.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    public PaymentResponse getPaymentDetailsById(PaymentRequest internalRequestObj){
        PaymentEntity paymentModel  = paymentRepository.getPaymentById(internalRequestObj);

        PaymentResponse paymentResponse = mapModelToResponseDTO(paymentModel);
        return paymentResponse;
    }

    private PaymentResponse mapModelToResponseDTO(PaymentEntity paymentModel){
        PaymentResponse response = new PaymentResponse();
        response.setPaymentId(paymentModel.getId());
        response.setAmount(paymentModel.getPaymentAmount());
        response.setCurrency(paymentModel.getPaymentCurrency());
        return response;
    }
}
