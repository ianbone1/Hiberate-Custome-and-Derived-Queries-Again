package com.codeclan.coursebookings.coursebookings.Repositories.BookingRepository;

import com.codeclan.coursebookings.coursebookings.Models.Booking;
import com.codeclan.coursebookings.coursebookings.Projections.EmbedBookingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedBookingInfo.class)
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByDate(String date);
}
