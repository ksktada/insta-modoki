package com.instamodoki;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
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

    @DgsMutation
    public Photo postPhoto(@InputArgument PostPhotoInput input) {
        final OffsetDateTime d = OffsetDateTime.now();
        final List<User> taggedUsers = new ArrayList<User>();
        final Photo photo = new Photo("p2", input.getName(), "", "", input.getCategory(), me, taggedUsers, d);
        return photo;
    }

    @DgsMutation
    public Photo tagPhoto(@InputArgument String githubLogin, @InputArgument String photoID) {
        final OffsetDateTime d = OffsetDateTime.now();
        final List<User> taggedUsers = new ArrayList<User>();
        final Photo photo = new Photo("p3", "We", "", "", PhotoCategory.PORTRAIT, me, taggedUsers, d);
        return photo;
    }

    @DgsMutation
    public AuthPayload githubAuth(@InputArgument String code) {
        final AuthPayload a = new AuthPayload("token", me);
        return a;
    }

    @DgsMutation
    public List<User> addFakeUsers(@InputArgument int count) {
        final List<User> users = new ArrayList<User>();
        return users;
    }

    @DgsMutation
    public AuthPayload fakeUserAuth(@InputArgument String code) {
        final AuthPayload a = new AuthPayload("fake", me);
        return a;
    }
}
