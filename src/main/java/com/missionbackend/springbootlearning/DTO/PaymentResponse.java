package com.missionbackend.springbootlearning.DTO;

public class PaymentResponse {
    private Long paymentId;
    private double amount;

    private String currency;

    public Long getPaymentId(){return this.paymentId;}
    public void setPaymentId(Long paymentId){this.paymentId=paymentId;}
    public double getAmount(){return this.amount;}
    public void setAmount(double amount){this.amount=amount;}
    public String getCurrency(){return this.currency;}
    public void setCurrency(String currency){this.currency=currency;}
}
