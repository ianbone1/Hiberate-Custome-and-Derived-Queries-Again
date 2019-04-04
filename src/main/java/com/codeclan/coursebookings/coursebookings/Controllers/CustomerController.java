package com.codeclan.coursebookings.coursebookings.Controllers;

import com.codeclan.coursebookings.coursebookings.Models.Customer;
import com.codeclan.coursebookings.coursebookings.Repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/courseid/{id}")
    public List<Customer> findByCourseId(@PathVariable Long id){
        return customerRepository.findByCourseId(id);
    }

}
