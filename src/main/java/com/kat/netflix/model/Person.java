package com.kat.netflix.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;
import java.sql.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class Person extends BaseModel {
    private String name;
    private int age;
    private Date dateOfBirth;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String city;
    @Enumerated(EnumType.STRING)
    private Country country;
}