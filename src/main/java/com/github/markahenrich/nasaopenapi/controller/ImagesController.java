package com.github.markahenrich.nasaopenapi.controller;

import com.github.markahenrich.nasaopenapi.model.imagesapi.ImagesApiResponse;
import com.github.markahenrich.nasaopenapi.service.ImagesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/images")
@CrossOrigin
public class ImagesController {
    ImagesService imagesService;

    public ImagesController(ImagesService imagesService) {
        this.imagesService = imagesService;
    }

    @GetMapping("/search")
    public ImagesApiResponse getSearchResult(@RequestParam("q") String query) {
        return imagesService.getSearchResults(query);
    }

}
