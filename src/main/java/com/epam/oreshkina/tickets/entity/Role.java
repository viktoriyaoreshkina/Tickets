package epam.tickets;

import static java.lang.Math.pow;

/**
 * Created by Viktoriya_Oreshkina on 28-Oct-14.
 */
//The role may be client, seller or admin of Database.


public class Role {

    //fields
    private int roleId;
    private int roleType;

    public int getRoleType() {
        return roleType;
    }

    public void setRoleType(int roleType) {
        this.roleType = roleType;
    }
}
