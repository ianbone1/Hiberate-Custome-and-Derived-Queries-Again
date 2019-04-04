package com.codeclan.coursebookings.coursebookings.Repositories.CourseRepository;

import com.codeclan.coursebookings.coursebookings.Models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryCustomImpl implements CourseRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> findByCustomer(Long id) {
        List<Course> result = null;

        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.add(Restrictions.eq("bookingAlias.customer.id", id));
            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        }
        return result;
    }
}
