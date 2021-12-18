package com.photoshare;

public class PostPhotoInput {
    private final String name;
    private final String description;
    private final PhotoCategory category;

    public PostPhotoInput(String name, String description, PhotoCategory category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public PhotoCategory getCategory() {
        return category;
    }
}
