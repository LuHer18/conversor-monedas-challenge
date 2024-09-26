package com.mycompanyname;


import com.mycompanyname.model.Currency;
import com.mycompanyname.service.CurrencyApi;

public class Main {
    public static void main(String[] args) {

        CurrencyApi currencyApi = new CurrencyApi();

        System.out.println(currencyApi.convertCurrency(Currency.COP, Currency.USD,20000.2));


    }
}