package epam.tickets;

import java.util.Date;

/**
 * Created by Viktoriya_Oreshkina on 28-Oct-14.
 */
public class Event {
    //fieds
    private int eventId;
    private String eventName;
    private String eventAddress;
    private Date eventDate;
    private String ticketAmount;
    private boolean eventTrue;

    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventAddress() {
        return eventAddress;
    }
    public void setEventAddress(String eventAddress) {
        this.eventAddress = eventAddress;
    }

    public Date getEventDate() {
        return eventDate;
    }
    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getTicketAmount() {
        return ticketAmount;
    }
    public void setTicketAmount(String ticketAmount) {
        this.ticketAmount = ticketAmount;
    }
}
