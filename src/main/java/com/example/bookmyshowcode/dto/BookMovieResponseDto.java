package com.example.bookmyshowcode.dto;

import com.example.bookmyshowcode.models.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class BookMovieResponseDto {
    private Long bookingId;
    private int amount;
    private ResponseStatus responseStatus;

}
