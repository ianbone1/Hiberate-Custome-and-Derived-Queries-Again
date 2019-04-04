package com.codeclan.coursebookings.coursebookings.Projections;

import com.codeclan.coursebookings.coursebookings.Models.Booking;
import com.codeclan.coursebookings.coursebookings.Models.Course;
import com.codeclan.coursebookings.coursebookings.Models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "EmbedBookingInfo", types = Booking.class)
public interface EmbedBookingInfo {
    Long getId();
    String getDate();
    Course getCourse();
    Customer getCustomer();
//    List<Booking> getBookings();
}
