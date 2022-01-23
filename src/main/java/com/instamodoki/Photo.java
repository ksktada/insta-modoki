package com.instamodoki;

import java.util.List;
import java.time.OffsetDateTime;

public class Photo {
    private final String id;
    private final String name;
    private final String url;
    private final String description;
    private final PhotoCategory category;
    private final User postedBy;
    private final List<User> taggedUsers;
    private final OffsetDateTime created;

    public Photo(String id, String name, String url, String description, PhotoCategory category, User postedBy, List<User> taggedUsers, OffsetDateTime created) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.description = description;
        this.category = category;
        this.postedBy = postedBy;
        this.taggedUsers = taggedUsers;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public PhotoCategory getCategory() {
        return category;
    }

    public User getPostedBy() {
        return postedBy;
    }

    public OffsetDateTime getCreated() {
        return created;
    }
}
