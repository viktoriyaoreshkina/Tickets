package com.epam.oreshkina.tickets.entity;

/**
 * Created by Viktoriya_Oreshkina on 05-Nov-14.
 */
public class Cash {
    //fields
    private int event;
    private Integer ticketAmountSale;
    private Integer ticketAmountReserv;

    public Integer getTicketAmountSale() {
        return ticketAmountSale;
    }
    public void setTicketAmountSale(Integer ticketAmountSale) {
        this.ticketAmountSale = ticketAmountSale;
    }

    public Integer getTicketAmountReserv() {
        return ticketAmountReserv;
    }
    public void setTicketAmountReserv(Integer ticketAmountReserv) {
        this.ticketAmountReserv = ticketAmountReserv;
    }
}
