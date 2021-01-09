package com.rate.exchange.gif.currencyservice.controllers;

import com.rate.exchange.gif.currencyservice.services.ExchageRatesService;
import com.rate.exchange.gif.currencyservice.services.GiphyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencies")
public class CurrenciesController {

    @Autowired
    private ExchageRatesService exchageRatesService;

    @Autowired
    GiphyService giphyService;

    @GetMapping("/compare")
    public Object compare(@RequestParam(value = "currency", required = false) String currency) {
        return giphyService.getGiphy(exchageRatesService.todayMore(currency));
    }
}
