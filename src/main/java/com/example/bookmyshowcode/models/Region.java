package com.example.bookmyshowcode.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Region extends BaseModel{ //city
    private String name;

    //private List<Theatre> theatres; //depends on access pattern
}
