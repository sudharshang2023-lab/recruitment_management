package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App app = new App();

    @Test
    void testValidDonation() {
        String result = app.processDonation(500, "John");
        assertEquals("Donation of ₹500.0 by John processed successfully", result);
    }

    @Test
    void testInvalidAmount() {
        String result = app.processDonation(0, "John");
        assertEquals("Invalid donation details", result);
    }

    @Test
    void testNegativeAmount() {
        String result = app.processDonation(-100, "John");
        assertEquals("Invalid donation details", result);
    }

    @Test
    void testEmptyDonorName() {
        String result = app.processDonation(100, "");
        assertEquals("Invalid donation details", result);
    }

    @Test
    void testNullDonorName() {
        String result = app.processDonation(100, null);
        assertEquals("Invalid donation details", result);
    }
}