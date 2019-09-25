package com.project.portfolio.models.profiles;

import com.project.portfolio.models.UserProfile;

import javax.persistence.Entity;

@Entity
public class PhotographyProfile extends BasicProfile {

    public PhotographyProfile(UserProfile profile) {
        super(profile);
    }
}
