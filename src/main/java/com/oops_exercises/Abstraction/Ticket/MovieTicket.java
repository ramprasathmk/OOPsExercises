package com.oops_exercises.Abstraction.Ticket;

public class MovieTicket extends Ticket {
    private String movieName;

    MovieTicket() {}

    MovieTicket(String movieName, double price) {
        super(price);
        this.movieName=movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName=movieName;
    }

    @Override
    public void book() {
        System.out.println("Booking "+movieName+" movie for "+getPrice()+" Rupees.");
    }
}
