package com.kat.netflix.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@Entity
public class UserProfile extends BaseModel {
    private String nickName;
    private String hashedPin;
    @Enumerated(EnumType.STRING)
    private UserProfileType userProfileType;
}