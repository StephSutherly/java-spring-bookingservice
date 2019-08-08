package com.codeclan.BookingService.BookingService.respositories.CourseRepository;

import com.codeclan.BookingService.BookingService.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findCourseByStarRating(int starRating);

//    List<Course> findCoursesByDate(String date);
}
