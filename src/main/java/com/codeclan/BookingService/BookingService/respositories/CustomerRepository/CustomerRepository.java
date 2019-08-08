package com.codeclan.BookingService.BookingService.respositories.CustomerRepository;

import com.codeclan.BookingService.BookingService.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
}
