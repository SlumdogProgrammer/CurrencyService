package com.rate.exchange.gif.currencyservice.services;

import com.rate.exchange.gif.currencyservice.clients.GiphyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GiphyService {

    @Value("${giphy.app_id}")
    private String app_id;

    @Value("${giphy.higer}")
    private String higer;

    @Value("${giphy.lower}")
    private String lower;

    @Autowired
    GiphyClient giphyClient;

    public Object getGiphy(boolean todayMore) {
        return todayMore ?
                giphyClient.getRandomGiphy(app_id, higer).getData().get("image_original_url") :
                giphyClient.getRandomGiphy(app_id, lower).getData().get("image_original_url");
    }
}
