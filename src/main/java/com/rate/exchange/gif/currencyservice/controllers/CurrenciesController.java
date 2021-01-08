package com.rate.exchange.gif.currencyservice.controllers;

import com.rate.exchange.gif.currencyservice.services.ExchageRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencies")
public class CurrenciesController {

    @Autowired
    private ExchageRatesService exchageRatesService;

    @GetMapping("/compare")
    public String compare(Model model) {
        model.addAttribute("result", exchageRatesService.todayMore());
        return "currencies/compare";
    }
}
