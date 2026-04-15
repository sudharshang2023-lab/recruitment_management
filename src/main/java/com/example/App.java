package com.example.donation;

public class App {

    // Method to validate donation
    public boolean validateDonation(double amount, String donorName) {
        if (donorName == null || donorName.trim().isEmpty()) {
            return false;
        }
        if (amount <= 0) {
            return false;
        }
        return true;
    }

    // Method to process donation
    public String processDonation(double amount, String donorName) {
        if (!validateDonation(amount, donorName)) {
            return "Invalid donation details";
        }

        // Simulate saving to database
        return "Donation of ₹" + amount + " by " + donorName + " processed successfully";
    }

    public static void main(String[] args) {
        App app = new App();

        String result = app.processDonation(1000, "Gokul");
        System.out.println(result);
    }
}