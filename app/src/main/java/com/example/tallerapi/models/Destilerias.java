package com.example.tallerapi.models;

import com.google.gson.annotations.SerializedName;

public class Destilerias {
    @SerializedName("slug")
    private String SlugDestileria;

    @SerializedName("name")
    private String NameDestileria;

    @SerializedName("country")
    private String CountryDestileria;

    @SerializedName("whiskybase_rating")
    private String RatingDestileria;


    public String getSlugDestileria() {
        return SlugDestileria;
    }

    public void setSlugDestileria(String slugDestileria) {
        SlugDestileria = slugDestileria;
    }

    public String getNameDestileria() {
        return NameDestileria;
    }

    public void setNameDestileria(String nameDestileria) {
        NameDestileria = nameDestileria;
    }

    public String getCountryDestileria() {
        return CountryDestileria;
    }

    public void setCountryDestileria(String countryDestileria) {
        CountryDestileria = countryDestileria;
    }

    public String getRatingDestileria() {
        return RatingDestileria;
    }

    public void setRatingDestileria(String ratingDestileria) {
        RatingDestileria = ratingDestileria;
    }

}
