package com.github.markahenrich.nasaopenapi.service;

import com.github.markahenrich.nasaopenapi.model.Apod;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ApodApiClient {
    @Qualifier("apod")
    private final WebClient webClient;

    public ApodApiClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public Apod getApod() {
        return webClient.get()
                .retrieve()
                .bodyToMono(Apod.class)
                .block();
    }
}
