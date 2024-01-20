package com.example.bookmyshowcode.controllers;

import com.example.bookmyshowcode.dto.BookMovieRequestDto;
import com.example.bookmyshowcode.dto.BookMovieResponseDto;
import com.example.bookmyshowcode.models.Booking;
import com.example.bookmyshowcode.models.ResponseStatus;
import com.example.bookmyshowcode.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookingController {//waiter  and it should return DTO not objects

    /*public Booking bookMovie(List<Long> showSeatIds, Long userId, Long showId) {
        // these are the parameters are provided by the user. we should not expose directly to the user.so we use DTO.

        return null;
    }*/ //this is a general method in controller before using/ creating DTO package.


    // controller will return responseDto to cliet and take requestDto from client as inputs.
    // controller will not have any business logic. it will just call the service layer.pass it to chef.

    /*public BookMovieResponseDto bookMovie(BookMovieRequestDto bookMovieRequestDto) {
        return null;
    }*/ // before creating the services package


    private  BookingService bookingService;

     @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto bookMovie(BookMovieRequestDto bookMovieRequestDto) {
        BookMovieResponseDto response = new BookMovieResponseDto();

        try {
            Booking booking = bookingService.bookMovie(bookMovieRequestDto.getUserId(),
                    bookMovieRequestDto.getShowId(),
                    bookMovieRequestDto.getShowSeatIds());

            response.setBookingId(booking.getId());
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setAmount(booking.getAmount());
        } catch (RuntimeException runtimeException) {
            response.setResponseStatus(ResponseStatus.FAILURE);
        }

        return response;
    }

    public Booking cancelMovie(){
        return null;
    }
}

