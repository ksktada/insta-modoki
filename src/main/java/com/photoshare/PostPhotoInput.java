package com.photoshare;

public class PostPhotoInput {
    private String name;
    private String description;
    private PhotoCategory category;

    public PostPhotoInput(String name, String description, PhotoCategory category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public PostPhotoInput(){}

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public PhotoCategory getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(PhotoCategory category) {
        this.category = category;
    }
}
