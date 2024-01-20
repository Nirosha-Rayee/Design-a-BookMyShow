package com.example.bookmyshowcode.dto;

import com.example.bookmyshowcode.models.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SignUpResponseDto {
    private Long userId;
    private ResponseStatus responseStatus;

}
