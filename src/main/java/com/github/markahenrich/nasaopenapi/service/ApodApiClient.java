package com.github.markahenrich.nasaopenapi.service;

import com.github.markahenrich.nasaopenapi.model.apod.Apod;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ApodApiClient {
    private final WebClient webClient;

    public ApodApiClient(@Qualifier("apod") WebClient webClient) {
        this.webClient = webClient;
    }

    public Apod getApod() {
        return webClient.get()
                .retrieve()
                .bodyToMono(Apod.class)
                .block();
    }
}
