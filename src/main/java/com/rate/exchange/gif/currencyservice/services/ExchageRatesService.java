package com.rate.exchange.gif.currencyservice.services;

import com.rate.exchange.gif.currencyservice.clients.ExchangeRatesClient;
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

    private LocalDate yesterday = LocalDate.now().minusDays(1);

    @Autowired
    private ExchangeRatesClient exchangeRatesClient;

    public boolean todayMore() {
        var yesterdayRate = exchangeRatesClient.getHistorical(yesterday.toString(), app_id, base, symbols);
        var todayRate = exchangeRatesClient.getLatest(app_id, base, symbols);
        if (yesterdayRate.getRate().get(symbols) < todayRate.getRate().get(symbols)) {
            return true;
        }
        return false;
    }

}
