package com.github.markahenrich.nasaopenapi.model.imagesapi;

import lombok.Data;

import java.util.List;

@Data
public class ImageData {
    String center;
    String title;
    String nasa_id;
    String date_created;
    List<String> keywords;
    String media_type;
    String description_508;
    String secondary_creator;
    String description;
}
