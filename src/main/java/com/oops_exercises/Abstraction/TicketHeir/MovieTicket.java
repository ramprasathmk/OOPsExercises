package com.oops_exercises.Abstraction.TicketHeir;

public class MovieTicket extends Ticket {
    private int hallNo;

    MovieTicket() {}
    MovieTicket(int hallNo, int seatNo) {
        super(seatNo);
        this.hallNo=hallNo;
    }

    public int getHallNo() {
        return hallNo;
    }

    public void setHallNo(int hallNo) {
        this.hallNo=hallNo;
    }

    @Override
    public void book() {
        System.out.println("Booking Seat No "+getSeatNo()+" in Hall No "+hallNo);
    }
}
