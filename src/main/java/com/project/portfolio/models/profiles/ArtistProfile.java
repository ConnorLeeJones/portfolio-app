package com.project.portfolio.models.profiles;

import com.project.portfolio.models.UserProfile;

import javax.persistence.Entity;

@Entity
public class ArtistProfile extends BasicProfile {

    public ArtistProfile(UserProfile profile) {
        super(profile);
    }
}
