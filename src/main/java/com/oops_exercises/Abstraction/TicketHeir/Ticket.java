package com.oops_exercises.Abstraction.TicketHeir;

abstract class Ticket {
    private int seatNo;
    Ticket() {}
    Ticket(int seatNo) {
        this.seatNo=seatNo;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo=seatNo;
    }

    abstract void book();
}
