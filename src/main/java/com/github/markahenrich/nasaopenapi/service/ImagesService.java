package com.github.markahenrich.nasaopenapi.service;

import com.github.markahenrich.nasaopenapi.model.imagesapi.ImagesApiResponse;
import org.springframework.stereotype.Service;

@Service
public class ImagesService {
    ImagesApiClient imagesApiClient;

    public ImagesService(ImagesApiClient imagesApiClient) {
        this.imagesApiClient = imagesApiClient;
    }

    public ImagesApiResponse getSearchResults(String query) {
        return imagesApiClient.getSearchResults(query);
    }
}
