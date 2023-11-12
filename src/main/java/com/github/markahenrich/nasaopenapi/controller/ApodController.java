package com.github.markahenrich.nasaopenapi.controller;

import com.github.markahenrich.nasaopenapi.model.Apod;
import com.github.markahenrich.nasaopenapi.service.ApodService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/apod")
@CrossOrigin
public class ApodController {
    private final ApodService apodService;

    public ApodController(ApodService apodService) {
        this.apodService = apodService;
    }
    @GetMapping
    public Apod getApod() {
        return apodService.getApod();
    }
}
