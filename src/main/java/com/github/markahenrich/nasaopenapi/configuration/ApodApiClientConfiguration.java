package com.github.markahenrich.nasaopenapi.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ApodApiClientConfiguration {
    @Value("${nasa.apod.url}")
    private String baseUrl;
    @Value("${API_KEY}")
    private String apiKey;

    @Bean
    @Qualifier("apod")
    public WebClient getWebclient() {
        return WebClient
                .builder()
                .baseUrl(baseUrl + "?api_key="+ apiKey)
                .build();
    }
}
