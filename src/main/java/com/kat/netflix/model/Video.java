package com.kat.netflix.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Video extends BaseModel {
    private String name;
    private String description;
    @ManyToMany
    private List<Cast> casts;
}