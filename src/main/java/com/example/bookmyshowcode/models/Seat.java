package com.example.bookmyshowcode.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Seat extends BaseModel{
    private String number;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
    private int rowValue;
    private int colValue;

}
