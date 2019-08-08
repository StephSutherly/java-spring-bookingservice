package com.codeclan.BookingService.BookingService.respositories.CustomerRepository;

import com.codeclan.BookingService.BookingService.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getCustomersByCourseId(Long courseId);
}
