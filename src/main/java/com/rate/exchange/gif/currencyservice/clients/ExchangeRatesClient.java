package com.rate.exchange.gif.currencyservice.clients;

import com.rate.exchange.gif.currencyservice.models.ExchangeRate;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "exchange_rates",url = "${openexchagerates.uri}")
public interface ExchangeRatesClient {

    @GetMapping("latest.json?app_id={app_id}&base={base}}&symbols={symbols}}")
    ExchangeRate getLatest(@PathVariable("app_id") String app_id,
                           @PathVariable("base") String base,
                           @PathVariable("symbols") String symbols);

    @GetMapping("historical/{date}.json?app_id={app_id}&base={base}}&symbols={symbols}}")
    ExchangeRate getHistorical(@PathVariable("date") String date,
                               @PathVariable("app_id") String app_id,
                               @PathVariable("base") String base,
                               @PathVariable("symbols") String symbols);
}
