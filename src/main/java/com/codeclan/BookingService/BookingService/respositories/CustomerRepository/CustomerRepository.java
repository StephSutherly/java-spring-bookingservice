package com.codeclan.BookingService.BookingService.respositories.CustomerRepository;

import com.codeclan.BookingService.BookingService.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

//    List<Customer> findCustomersByCourseId(Long courseId);

}
