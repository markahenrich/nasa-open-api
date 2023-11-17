package com.github.markahenrich.nasaopenapi.service;

import com.github.markahenrich.nasaopenapi.model.imagesapi.ImagesApiResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ImagesApiClient {
    private final WebClient webClient;

    public ImagesApiClient(@Qualifier("images") WebClient webClient) {
        this.webClient = webClient;
    }

    public ImagesApiResponse getSearchResults(String query) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/search")
                        .queryParam("q", query)
                        .build())
                .retrieve()
                .bodyToMono(ImagesApiResponse.class)
                .block();
    }
}
