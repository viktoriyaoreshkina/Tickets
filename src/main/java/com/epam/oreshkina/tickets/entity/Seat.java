package com.epam.oreshkina.tickets.entity;

import java.util.Comparator;

/**
 * Created on 04-Nov-14.
 */
public class Seat {
    public static final Comparator PRICE_COMPARATOR = new PriceComparator();

    public enum Type {
        PARTERRE, LOGE, BALCONY
    }

    public enum Status {
        FREE, BOOKED, SOLD
    }

    //fiels
    private int id;
    private int number;
    private int numberRow;
    private Status status;
    private Type type;
    private int cost;
    private Event event;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberRow() {
        return numberRow;
    }

    public void setNumberRow(int numberRow) {
        this.numberRow = numberRow;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }



    private static class PriceComparator implements Comparator<Seat>{

        @Override
        public int compare(Seat s1, Seat s2) {
            return Integer.compare(s1.cost, s2.cost);
        }
    }
}
