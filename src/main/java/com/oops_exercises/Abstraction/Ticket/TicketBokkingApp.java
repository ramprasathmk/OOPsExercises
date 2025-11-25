package com.oops_exercises.Abstraction.Ticket;

public class TicketBokkingApp {
    static void main() {
        Ticket app=new MovieTicket("Kantara", 250.17);
        app.book();
    }
}
