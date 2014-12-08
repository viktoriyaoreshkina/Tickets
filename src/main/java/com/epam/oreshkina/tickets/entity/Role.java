package com.epam.oreshkina.tickets.entity;

/**
 * Created by Viktoriya_Oreshkina on 28-Oct-14.
 */
//The role may be client, seller or admin of Database.


public class Role {

    private int id;
    private int type;

    public enum Type {
        CLIENT, SELLER, ADMIN
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
