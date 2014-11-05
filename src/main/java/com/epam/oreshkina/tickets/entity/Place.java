package com.epam.oreshkina.tickets.entity;

/**
 * Created by Viktoriya_Oreshkina on 04-Nov-14.
 */
public class Place {
    //fiels
    private int placeId;
    private int placeNumber;
    private int placeNumberRow;
    private int placeStatus; //0 - null, 1 - free, 2 - reserv, 3 - sale. Save values for fieds in DB
    private int placeType; //0 - партер, 1 - ложа, 2 - балкон
    private int placeCost;
    private int eventId;

    public int getPlaceNumber() {
        return placeNumber;
    }

    public int getPlaceNumberRow() {
        return placeNumberRow;
    }

    public int getPlaceStatus() {
        return placeStatus;
    }

    public int getPlaceType() {
        return placeType;
    }

    public int getPlaceCost() {
        return placeCost;
    }

    public void setPlaceNumber(int placeNumber) {
        this.placeNumber = placeNumber;
    }

    public void setPlaceNumberRow(int placeNumberRow) {
        this.placeNumberRow = placeNumberRow;
    }

    public void setPlaceStatus(int placeStatus) {
        this.placeStatus = placeStatus;
    }

    public void setPlaceCost(int placeCost) {
        this.placeCost = placeCost;
    }

    public void setPlaceType(int placeType) {
        this.placeType = placeType;
    }
}
