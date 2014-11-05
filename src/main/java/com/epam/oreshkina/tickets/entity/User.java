package epam.tickets;

/**
 * Created by Viktoriya_Oreshkina on 31-Oct-14.
 */
public class User { //This method save user's methods

    //fields
    private int userId;
    private String login;
    private String pass;
    private String role;
    private String email;

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //methods itself
    //for Ticket
    public User(){}

    private void createTicket(){ //create and save

    }

    public void buyTicket(){

    }

    public void reservTicket(){

    }

    public void delTicket(){

    }

    public void editReservTicket(){

    }

    public void delReservTicket(){

    }

    public void editBuyTicket(){

    }

    public void delBuyTicket(){

    }

    //for Event
    public void createEvent(){

    }

    public void editEvent(){

    }

    public void delEvent(){

    }

    //for Order
    public void createOrder(){

    }

    public void editOrder(){

    }

    public void delOrder(){

    }

    // content control methods
    public void createText(){ //пока Text, может быть стоит потом назвать точнее

    }

    public void editText(){

    }

    public void delText(){

    }


}
