package com.epam.oreshkina.tickets.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created on 08.12.2014.
 */
@XmlRootElement
public class PlaceEvent {
    private Event event1;
    private Event event2;

    PlaceEvent(){};

    public PlaceEvent(Event event1, Event event2) {
        this.event1 = event1;
        this.event2 = event2;
    }

    public Event getEvent1() {
        return event1;
    }

    public void setEvent1(Event event1) {
        this.event1 = event1;
    }

    public Event getEvent2() {
        return event2;
    }

    public void setEvent2(Event event2) {
        this.event2 = event2;
    }
}
