package com.codeclan.coursebookings.coursebookings.Repositories.CustomerRepository;

import com.codeclan.coursebookings.coursebookings.Models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    // this has been replaced by derived query findCustomersByBookingsCourseId
    List<Customer> findByCourseId(Long courseId);
}
