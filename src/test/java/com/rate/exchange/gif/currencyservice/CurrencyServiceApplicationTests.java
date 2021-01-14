package com.rate.exchange.gif.currencyservice;

import com.rate.exchange.gif.currencyservice.services.ExchageRatesService;
import com.rate.exchange.gif.currencyservice.services.GiphyService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.ArgumentMatchers.anyString;

@RunWith(SpringRunner.class)
@SpringBootTest
class CurrencyServiceApplicationTests {

    @Autowired
    private GiphyService gifService;
    @MockBean
    private ExchageRatesService gifClient;

    @Test
    public void whenPositiveChanges() {
        boolean todayMore = true;
        Mockito.when(gifClient.todayMore(anyString()))
                .thenReturn(todayMore);
        Object res = gifService.getGiphy(true);
        Assert.assertNotNull(res);
    }

}
