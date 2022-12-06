package casestudy_module2.controllers;

import casestudy_module2.services.BookingService;

import java.util.Scanner;

public class BookingManagement {
    public void mainMenuBookingManagement(){
        Scanner scanner = new Scanner(System.in);
        BookingService bookingService = new BookingService() {
            @Override
            public void display() {

            }

            @Override
            public void add() {

            }
        }
    }
}
