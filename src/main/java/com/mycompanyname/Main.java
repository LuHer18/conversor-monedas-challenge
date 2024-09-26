package com.mycompanyname;


import com.mycompanyname.service.CurrencyApi;

public class Main {
    public static void main(String[] args) {

        CurrencyApi currencyApi = new CurrencyApi();

        System.out.println(currencyApi.convertCurrency("COP", "USD",20000));


    }
}