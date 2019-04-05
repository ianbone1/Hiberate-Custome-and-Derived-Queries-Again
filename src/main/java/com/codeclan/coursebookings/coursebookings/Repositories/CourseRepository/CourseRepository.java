package com.codeclan.coursebookings.coursebookings.Repositories.CourseRepository;

import com.codeclan.coursebookings.coursebookings.Models.Course;
import com.codeclan.coursebookings.coursebookings.Projections.EmbedCourseInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCourseInfo.class)
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom{

    List<Course> findAllCoursesByStars(int stars);

    //Get all courses for a given customer
    List<Course> findCoursesByBookingsCustomerId(Long id);

}
