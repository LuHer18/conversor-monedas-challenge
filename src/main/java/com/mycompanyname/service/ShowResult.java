package com.mycompanyname.service;

import com.mycompanyname.model.Currency;

import java.util.Scanner;

public class ShowResult {

    public static Conversion showResultMenu(Scanner keyboard, CurrencyApi currencyApi, Currency from, Currency to){
        System.out.println("Diga el valor que desea convertir de " + from + " a " + to);
        double amount = keyboard.nextDouble();
        return currencyApi.convertCurrency(from, to, amount);
    }
}
