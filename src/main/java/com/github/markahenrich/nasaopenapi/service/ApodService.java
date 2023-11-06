package com.github.markahenrich.nasaopenapi.service;

import com.github.markahenrich.nasaopenapi.model.Apod;
import org.springframework.stereotype.Service;

@Service
public class ApodService {
    private final ApodApiClient apodApiClient;

    public ApodService(ApodApiClient apodApiClient) {
        this.apodApiClient = apodApiClient;
    }

    public Apod getApod() {
        return apodApiClient.getApod();
    }
}
