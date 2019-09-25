package com.project.portfolio.services;

import com.project.portfolio.models.User;
import com.project.portfolio.models.profiles.*;

public class ProfileFactory {

    private User user;
    private String profileType;

    public ProfileFactory(User user, String profileType) {
        this.user = user;
        this.profileType = profileType;
    }

    public BasicProfile createProfile(){
        switch (profileType){
            case "artist":
                return new ArtistProfile(user.getUserProfile());
            case "musician":
                return new MusicianProfile(user.getUserProfile());
            case "photography":
                return new PhotographyProfile(user.getUserProfile());
            case "video":
                return new VideoProfile(user.getUserProfile());
            default:
                return null;
        }
    }

}
