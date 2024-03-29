package com.codeclan.BookingService.BookingService.components;

import com.codeclan.BookingService.BookingService.models.Booking;
import com.codeclan.BookingService.BookingService.models.Course;
import com.codeclan.BookingService.BookingService.models.Customer;
import com.codeclan.BookingService.BookingService.respositories.BookingRepository.BookingRepository;
import com.codeclan.BookingService.BookingService.respositories.CourseRepository.CourseRepository;
import com.codeclan.BookingService.BookingService.respositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Course course1 = new Course("Philosophy", "Edinburgh", 2);
        courseRepository.save(course1);

        Course course2 = new Course("Intermediate German", "Glasgow", 5);
        courseRepository.save(course2);

        Course course3 = new Course("Mathematics", "Edinburgh", 4);
        courseRepository.save(course3);


        Customer customer1 = new Customer("Rory", "Edinburgh", 31);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Steph", "Edinburgh", 26);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Bob", "Glasgow", 48);
        customerRepository.save(customer3);


        Booking booking1 = new Booking("01/08/19", course1, customer2);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("01/10/19", course3, customer1);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("12/08/19", course2, customer2);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("01/09/19", course1, customer3);
        bookingRepository.save(booking4);
    }

}
