package com.project.portfolio.models.profiles;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.project.portfolio.models.UserProfile;

import javax.persistence.*;

@Entity
public abstract class BasicProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profiles", nullable = false)
    @JsonBackReference
    private UserProfile userProfile;
    private Long userProfileId;

    public BasicProfile(){}

    public BasicProfile(UserProfile profile) {
        this.userProfile = profile;
        this.userProfileId = profile.getId();
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
