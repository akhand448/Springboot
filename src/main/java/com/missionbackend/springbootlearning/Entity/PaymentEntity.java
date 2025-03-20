package com.missionbackend.springbootlearning.Entity;

public class PaymentEntity {
    private Long id;
    private String paymentCurrency;
    private double paymentAmount;
    private String  userEmail;

    public Long getId(){return this.id;}
    public void setId(Long id){this.id = id;}

    public String getPaymentCurrency(){return this.paymentCurrency;}
    public void setPaymentCurrency(String paymentCurrency){this.paymentCurrency=paymentCurrency;}
    public double getPaymentAmount(){return this.paymentAmount;}
    public void setPaymentAmount(double paymentAmount){this.paymentAmount=paymentAmount;}
    public String getUserEmail(){return this.userEmail;}
    public void setUserEmail(String userEmail){this.userEmail=userEmail;}
}
