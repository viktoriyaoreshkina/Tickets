package com.epam.oreshkina.tickets.entity;

/**
 * Created on 28-Oct-14.
 */
public class Event {
    //fieds
    private int id;
    private String name;
    private String address;
    //private Date date;
   // private LocalDateTime dateTime;
    private String date;
    private String dateTime;
  /*  private List<Seat> seatList;*/ private Seat seat;
    //private boolean active;


    public Event(int id, String name, String address, String date, String dateTime, Seat seat) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.date = date;
        this.dateTime = dateTime;
        this.seat = seat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

/*   public List<Seat> getFreeSeatList() {
        List<Seat> freeSeatList = new ArrayList<Seat>();
        for (Seat seat : seatList) {
            if (seat.getStatus() == Seat.Status.FREE) {
                freeSeatList.add(seat);
            }
        }
        Collections.sort(freeSeatList, Seat.PRICE_COMPARATOR);
        return freeSeatList;
    }*/


}