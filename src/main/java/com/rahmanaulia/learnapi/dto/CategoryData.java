package com.rahmanaulia.learnapi.dto;

import javax.validation.constraints.NotEmpty;

public class CategoryData {

    @NotEmpty(message = "Name is required")
    private String name;

    public CategoryData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
