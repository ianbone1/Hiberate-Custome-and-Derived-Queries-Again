package com.codeclan.coursebookings.coursebookings.Controllers;

import com.codeclan.coursebookings.coursebookings.Models.Course;
import com.codeclan.coursebookings.coursebookings.Repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/stars/{stars}")
    public List<Course> findAllCoursesByStars(@PathVariable int stars){
        return courseRepository.findAllCoursesByStars(stars);
    }

//    @GetMapping("/customer/{id}")
//    public List<Course> findByCustomer(@PathVariable Long id){
//        return courseRepository.findByCustomer(id);
//    }

    @GetMapping("/customer/{id}")
    public List<Course> findCoursesByCustomerId(@PathVariable Long id){
        return courseRepository.findCoursesByBookingsCustomerId(id);
    }
}

