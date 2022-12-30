package com.currency.conversion.service;

import com.currency.conversion.model.ConvertRes;

import java.util.List;

public interface ApiService {
    List<String> getSymbols();

    ConvertRes getCurrencyConverted(String from, String to, String amount);
}
