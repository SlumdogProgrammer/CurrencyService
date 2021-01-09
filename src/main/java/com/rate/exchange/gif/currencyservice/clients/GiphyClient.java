package com.rate.exchange.gif.currencyservice.clients;

import com.rate.exchange.gif.currencyservice.models.Giphy;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="giphy-client",url = "${giphy.uri}")
public interface GiphyClient {

    @GetMapping("random?api_key={api_key}&tag={tag}&rating=g")
    Giphy getRandomGiphy(@PathVariable("api_key") String api_key,
                         @PathVariable("tag") String tag);
}
