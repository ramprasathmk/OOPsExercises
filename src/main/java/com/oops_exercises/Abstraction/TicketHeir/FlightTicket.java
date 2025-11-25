package com.oops_exercises.Abstraction.TicketHeir;

public class FlightTicket extends Ticket {
    private String flightNo;

    FlightTicket() {}

    FlightTicket(String flightNo, int seatNo) {
        super(seatNo);
        this.flightNo=flightNo;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo=flightNo;
    }

    @Override
    public void book() {
        System.out.println("Booking Seat No "+getSeatNo()+" in Flight "+flightNo);
    }
}
