package com.oops_exercises.Abstraction.TicketHeir;

public class TicketBookingApp {
    static void main() {
        Ticket app1=new MovieTicket(5, 147);
        Ticket app2=new FlightTicket("Lufthansa", 19);
        app1.book();
        System.out.println();
        app2.book();
    }
}
