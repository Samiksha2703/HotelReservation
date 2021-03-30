package com.bridgelabz.hotelreservationtest;

import com.bridgelabz.hotelreservation.HotelReservation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void givenHotel_WhenAdded_ShouldReturn_TRUE() {
        boolean result = hotelReservation.addHotel("Hyatt", 950.00);
        Assertions.assertTrue(result);
    }
}
