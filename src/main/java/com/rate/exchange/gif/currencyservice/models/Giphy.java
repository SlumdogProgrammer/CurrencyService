package com.rate.exchange.gif.currencyservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Giphy {
    private Map<String, Object> data;

    public Map<String, Object> getData() {
        return data;
    }
}
