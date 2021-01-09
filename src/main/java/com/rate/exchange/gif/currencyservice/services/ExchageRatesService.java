package com.rate.exchange.gif.currencyservice.services;

import com.rate.exchange.gif.currencyservice.clients.ExchangeRatesClient;
import com.rate.exchange.gif.currencyservice.models.ExchangeRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ExchageRatesService {

    @Value("${openexchagerates.app_id}")
    private String app_id;

    @Value("${openexchagerates.base}")
    private String base;

    @Value("${openexchagerates.symbols}")
    private String symbols;

    @Autowired
    private ExchangeRatesClient exchangeRatesClient;

    public boolean todayMore(String currency) {
        if (currency != null)
            symbols = currency;
        ExchangeRate yesterdayRate = exchangeRatesClient.
                getHistorical(LocalDate.now().minusDays(1).toString(), app_id, base, symbols);
        ExchangeRate todayRate = exchangeRatesClient.getLatest(app_id, base, symbols);
        System.out.println(yesterdayRate.getRates());
        if (yesterdayRate.getRates().get(symbols) < todayRate.getRates().get(symbols)) {
            return true;
        }
        return false;
    }

}
