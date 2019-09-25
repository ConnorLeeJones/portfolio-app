package com.project.portfolio.models.profiles;

import com.project.portfolio.models.UserProfile;

import javax.persistence.Entity;

@Entity
public class VideoProfile extends BasicProfile {

    public VideoProfile(UserProfile profile) {
        super(profile);
    }
}
