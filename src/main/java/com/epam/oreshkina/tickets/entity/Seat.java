package com.epam.oreshkina.tickets.entity;

import java.util.Comparator;

/**
 * Created on 04-Nov-14.
 */
public class Seat {
    Seat(){};
    public static final Comparator PRICE_COMPARATOR = new PriceComparator();

    public enum Type {
        PARTERRE, LOGE, BALCONY
    }

    public enum Status {
        FREE, BOOKED, SOLD
    }

    private int id;
    private int number;
    private int numberRow;
    private String status;
    private String type;
    private int cost;
   // private Event event;

    public Seat(int id, int number, int numberRow, String status, String type, int cost) {
        this.id = id;
        this.number = number;
        this.numberRow = numberRow;
        this.status = status;
        this.type = type;
        this.cost = cost;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumberRow() {
        return numberRow;
    }

    public void setNumberRow(int numberRow) {
        this.numberRow = numberRow;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private static class PriceComparator implements Comparator<Seat>{

        @Override
        public int compare(Seat s1, Seat s2) {
            return Integer.compare(s1.cost, s2.cost);
        }
    }
}
