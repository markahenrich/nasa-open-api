package com.github.markahenrich.nasaopenapi.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ImagesApiClientConfiguraton {
    @Value("${nasa.images.url}")
    private String baseUrl;

    @Bean
    @Qualifier("images")
    public WebClient getImagesWebclient() {
        return WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }
}
