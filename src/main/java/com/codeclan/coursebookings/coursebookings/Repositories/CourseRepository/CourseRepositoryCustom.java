package com.codeclan.coursebookings.coursebookings.Repositories.CourseRepository;

import com.codeclan.coursebookings.coursebookings.Models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findByCustomer(Long id);
}
