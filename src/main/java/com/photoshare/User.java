package com.photoshare;

import java.util.List;

public class User {
    private final String githubLogin;
    private final String name;
    private final String avatar;
    private final List<Photo> postedPhotos;
    private final List<Photo> inPhotos;

    public User(String githubLogin, String name, String avatar, List<Photo> postedPhotos, List<Photo> inPhotos) {
        this.githubLogin = githubLogin;
        this.name = name;
        this.avatar = avatar;
        this.postedPhotos = postedPhotos;
        this.inPhotos = inPhotos;
    }

    public String getGithubLogin() {
        return githubLogin;
    }

    public String getName() {
        return name;
    }

    public String getAvatar() {
        return avatar;
    }

    public List<Photo> getPostedPhotos() {
        return postedPhotos;
    }

    public List<Photo> getInPhotos() {
        return inPhotos;
    }
}
