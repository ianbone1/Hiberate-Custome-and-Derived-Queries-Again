package com.codeclan.coursebookings.coursebookings.Components;

import com.codeclan.coursebookings.coursebookings.Models.Booking;
import com.codeclan.coursebookings.coursebookings.Models.Course;
import com.codeclan.coursebookings.coursebookings.Models.Customer;
import com.codeclan.coursebookings.coursebookings.Repositories.BookingRepository.BookingRepository;
import com.codeclan.coursebookings.coursebookings.Repositories.CourseRepository.CourseRepository;
import com.codeclan.coursebookings.coursebookings.Repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Customer customer1 = new Customer("Ian", "Erskine", 47);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Kyle", "Erskine", 17);
        customerRepository.save(customer2);
        Course course1 = new Course("Python", "Glasgow",5);
        courseRepository.save(course1);
        Booking booking1 = new Booking("01-05-2019", course1, customer1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("01-05-2019", course1, customer2);
        bookingRepository.save(booking2);

    }
}
