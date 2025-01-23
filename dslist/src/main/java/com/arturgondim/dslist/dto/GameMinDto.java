package com.arturgondim.dslist.dto;

import com.arturgondim.dslist.entities.Game;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class GameMinDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    
    public GameMinDto(){

    }

    public GameMinDto(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
    
    


}
