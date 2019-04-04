package com.codeclan.coursebookings.coursebookings.Repositories.CustomerRepository;

import com.codeclan.coursebookings.coursebookings.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

//    List<Customer> findByCourseId(int course_id);
    // findAllCustomerByCourseId
    // findByCourseId
}
