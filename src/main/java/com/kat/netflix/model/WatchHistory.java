package com.kat.netflix.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class WatchHistory extends BaseModel {
    @ManyToOne
    private UserProfile userProfile;
    @ManyToOne
    private Video video;
    @Enumerated(EnumType.STRING)
    private WatchedStatus watchedStatus;
    private long lastWatchDurationInSeconds;
}