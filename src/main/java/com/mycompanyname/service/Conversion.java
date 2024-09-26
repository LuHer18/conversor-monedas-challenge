package com.mycompanyname.service;

import com.mycompanyname.model.Currency;

import java.time.LocalDateTime;

public class Conversion {
    private Currency fromCurrency;
    private Currency toCurrency;
    private  double amount;
    private double result;
    private LocalDateTime conversionDate;

    public Conversion(Currency fromCurrency, Currency toCurrency, double amount, double result, LocalDateTime conversionDate) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
        this.amount = amount;
        this.result = result;
        this.conversionDate = conversionDate;
    }

    public Currency getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(Currency fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public Currency getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(Currency toCurrency) {
        this.toCurrency = toCurrency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public LocalDateTime getConversionDate() {
        return conversionDate;
    }

    public void setConversionDate(LocalDateTime conversionDate) {
        this.conversionDate = conversionDate;
    }

    @Override
    public String toString() {
        return "{" +
                "fromCurrency=" + fromCurrency +
                ", toCurrency=" + toCurrency +
                ", amount=" + amount +
                ", result=" + result +
                ", conversionDate=" + conversionDate +
                '}';
    }
}
