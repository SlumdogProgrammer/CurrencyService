package com.rate.exchange.gif.currencyservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ExchangeRate {
    private Map<String, Double> rates;

    public Map<String, Double> getRates() {
        return rates;
    }
}
