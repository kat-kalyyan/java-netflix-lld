package com.kat.netflix.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Subscriber extends Person {
    private String userName;
    private String hashedPassword;
    @Enumerated(EnumType.STRING)
    SubscriptionPlan subscriptionPlan;
    @OneToMany
    private List<UserProfile> userProfiles;
}