package com.codeclan.coursebookings.coursebookings;

import com.codeclan.coursebookings.coursebookings.Models.Booking;
import com.codeclan.coursebookings.coursebookings.Models.Course;
import com.codeclan.coursebookings.coursebookings.Models.Customer;
import com.codeclan.coursebookings.coursebookings.Repositories.BookingRepository.BookingRepository;
import com.codeclan.coursebookings.coursebookings.Repositories.CourseRepository.CourseRepository;
import com.codeclan.coursebookings.coursebookings.Repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookingsApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCreateElements() {
		Customer customer1 = new Customer("Ian", "Erskine", 47);
		customerRepository.save(customer1);
		Course course1 = new Course("Python", "Glasgow",5);
		courseRepository.save(course1);
		Booking booking1 = new Booking("01-05-2019", course1, customer1);
		bookingRepository.save(booking1);
		assertEquals("Ian", booking1.getCustomer().getName());
	}
}
