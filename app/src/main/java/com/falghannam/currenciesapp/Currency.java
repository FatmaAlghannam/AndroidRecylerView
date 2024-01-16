package com.falghannam.currenciesapp;

public class Currency {
    private String currencyCode;
    private String currenyName;
    private double exchangeRate;


    public Currency(String currencyCode, String currenyName, double exchangeRate) {
        this.currencyCode = currencyCode;
        this.currenyName = currenyName;
        this.exchangeRate = exchangeRate;

    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrenyName() {
        return currenyName;
    }

    public void setCurrenyName(String currenyName) {
        this.currenyName = currenyName;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


}

