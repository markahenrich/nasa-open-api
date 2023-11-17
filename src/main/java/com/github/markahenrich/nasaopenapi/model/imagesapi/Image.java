package com.github.markahenrich.nasaopenapi.model.imagesapi;

import lombok.Data;

import java.util.List;

@Data
public class Image {
    String href;
    List<ImageData> data;
    List<ImageLink> links;
}
