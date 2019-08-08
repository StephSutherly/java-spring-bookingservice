package com.codeclan.BookingService.BookingService.respositories.BookingRepository;

import com.codeclan.BookingService.BookingService.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
