package com.codeclan.BookingService.BookingService;

import com.codeclan.BookingService.BookingService.models.Course;
import com.codeclan.BookingService.BookingService.respositories.BookingRepository.BookingRepository;
import com.codeclan.BookingService.BookingService.respositories.CourseRepository.CourseRepository;
import com.codeclan.BookingService.BookingService.respositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingServiceApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canFindCoursesByRating() {
		List<Course> found = courseRepository.findCourseByStarRating(4);
		assertEquals(new Long(3), found.get(0).getId());
	}

}
