package com.codeclan.BookingService.BookingService.respositories.CustomerRepository;

import com.codeclan.BookingService.BookingService.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> getCustomersByCourseId(Long courseId) {
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria criteria = session.createCriteria(Customer.class);
            criteria.createAlias("bookedCourses", "bookingAlias");
            criteria.add(Restrictions.eq("bookingAlias.course.id", courseId));

            results = criteria.list();
        }
        catch(HibernateException ex) {
            ex.printStackTrace();
        }
        return results;
    }
}
