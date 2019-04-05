package com.codeclan.coursebookings.coursebookings.Repositories.CustomerRepository;

import com.codeclan.coursebookings.coursebookings.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    // Get all customers for a given course
    List<Customer> findCustomersByBookingsCourseId(Long id);

    // Get all customers in a given town for a given course
    List<Customer> findCustomersByTownAndBookingsCourseId(String town, Long id);

    // Get all customers over a certain age in a given town for a given course
    List<Customer> findCustomersByAgeAndTownAndBookingsCourseId(int age, String town,Long id);

    // List<Customer> findByCourseId(int course_id);
    // findAllCustomerByCourseId
    // findByCourseId
}
