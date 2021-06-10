package com.example.tallerapi.models;

import com.google.gson.annotations.SerializedName;

public class Whishy {

    @SerializedName("slug")
    private String SlugWhisky;

    @SerializedName("name")
    private String NameWhisky;

    public String getSlugWhisky() {
        return SlugWhisky;
    }

    public void setSlugWhisky(String slugWhisky) {
        SlugWhisky = slugWhisky;
    }

    public String getNameWhisky() {
        return NameWhisky;
    }

    public void setNameWhisky(String nameWhisky) {
        NameWhisky = nameWhisky;
    }
}
