package com.codeclan.BookingService.BookingService.controllers;

import com.codeclan.BookingService.BookingService.models.Course;
import com.codeclan.BookingService.BookingService.respositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getCoursesByRating(@PathVariable int rating) {
        return courseRepository.findCourseByStarRating(rating);
    }


}
