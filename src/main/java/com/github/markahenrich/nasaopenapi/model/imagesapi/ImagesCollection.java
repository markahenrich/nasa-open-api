package com.github.markahenrich.nasaopenapi.model.imagesapi;

import lombok.Data;

import java.util.List;

@Data
public class ImagesCollection {
    String version;
    String href;
    List<Image> items;
    Metadata metadata;
    List<ImageCollectionLink> links;
}
