package com.missionbackend.springbootlearning.Controller;

import com.missionbackend.springbootlearning.DTO.PaymentRequest;
import com.missionbackend.springbootlearning.DTO.PaymentResponse;
import com.missionbackend.springbootlearning.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")

public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponse> getPaymentById(@PathVariable Long id){
        PaymentRequest internalRequestObj = new PaymentRequest();
        internalRequestObj.setPaymentId(id);

        PaymentResponse payment = paymentService.getPaymentDetailsById(internalRequestObj);

        return ResponseEntity.ok(payment);
    }
}
