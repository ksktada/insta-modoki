package com.photoshare;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@DgsComponent
public class PhotoShareDataFetcher {
    private final List<Photo> photos = new ArrayList<Photo>();
    private final List<Photo> inPhotos = new ArrayList<Photo>();
    private final User me = new User("111", "", "", photos, inPhotos);
    private final List<User> allUsers = List.of(me);

    @DgsQuery
    public User me() {
        return me;
    }

    @DgsQuery
    public int totalPhotos() {
        return photos.size();
    }

    @DgsQuery
    public List<Photo> allPhotos() {
        return photos;
    }

    @DgsQuery(field = "Photo")
    public Photo photo(@InputArgument String id) {
        final OffsetDateTime d = OffsetDateTime.now();
        final List<User> taggedUsers = new ArrayList<User>();
        final Photo photo = new Photo("p1", "smile", "", "", PhotoCategory.SELFIE, me, taggedUsers, d);
        return photo;
    }

    @DgsQuery
    public int totalUsers() {
        return allUsers.size();
    }

    @DgsQuery
    public List<User> allUsers() {
        return allUsers;
    }

    @DgsQuery(field = "User")
    public User user(@InputArgument String login) {
        return me;
    }
}
