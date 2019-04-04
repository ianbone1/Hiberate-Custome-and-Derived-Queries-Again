package com.codeclan.coursebookings.coursebookings.Repositories.CustomerRepository;

import com.codeclan.coursebookings.coursebookings.Models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryCustomImpl implements CustomerRepositoryCustom{


    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findByCourseId(Long courseId) {
        List<Customer> result = null;

        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingsAlias");
            cr.add(Restrictions.eq("bookingsAlias.course.id",courseId));
            result=cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        }

        return result;
    }
}
