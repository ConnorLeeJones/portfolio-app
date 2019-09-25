package com.project.portfolio.models.profiles;

import com.project.portfolio.models.UserProfile;

import javax.persistence.Entity;

@Entity
public class MusicianProfile extends BasicProfile {


    public MusicianProfile(UserProfile profile) {
        super(profile);
    }
}
