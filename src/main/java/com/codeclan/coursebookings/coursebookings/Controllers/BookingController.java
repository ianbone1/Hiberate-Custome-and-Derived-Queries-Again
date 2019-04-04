package com.codeclan.coursebookings.coursebookings.Controllers;

import com.codeclan.coursebookings.coursebookings.Models.Booking;
import com.codeclan.coursebookings.coursebookings.Repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping("/date/{date}")
    public List<Booking> findByDate(@PathVariable String date){
        return bookingRepository.findByDate(date);
    }
}
