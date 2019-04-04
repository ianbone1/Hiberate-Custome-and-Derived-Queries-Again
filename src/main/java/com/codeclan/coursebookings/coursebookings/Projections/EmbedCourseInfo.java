package com.codeclan.coursebookings.coursebookings.Projections;

import com.codeclan.coursebookings.coursebookings.Models.Booking;
import com.codeclan.coursebookings.coursebookings.Models.Course;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "EmbedCourseInfo", types = Course.class)
public interface EmbedCourseInfo {
    Long getId();
    String getName();
    String getTown();
    int getStars();
    List<Booking> getBookings();
}
