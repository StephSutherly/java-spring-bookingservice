package com.codeclan.BookingService.BookingService.respositories.CourseRepository;

import com.codeclan.BookingService.BookingService.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
