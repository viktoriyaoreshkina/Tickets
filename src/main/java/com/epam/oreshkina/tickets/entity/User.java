package epam.tickets;

/**
 * Created by Viktoriya_Oreshkina on 31-Oct-14.
 */
public class User extends SearchField{ //This method save user's methods //странное наследование

    //fields
    protected String login = '';
    protected String pass = '';
    protected String role = '';
    private String email = '';

    //methods itself
    //for Ticket
    public createTicket(){ //create and save

    }

    public buyTicket(){

    }

    public reservTicket(){

    }

    public delTicket(){

    }

    public editReservTicket(){

    }

    public delReservTicket(){

    }

    public editBuyTicket(){

    }

    public delBuyTicket(){

    }

    //for Measure
    public createMeasure(){

    }

    public editMeasure(){

    }

    public delMeasure(){

    }

    //for Order
    public createOrder(){

    }

    public editOrder(){

    }

    public delOrder(){

    }

    //methods caused
    SearchMethod SearMeth = new SearchMethod(String search)


    // content control methods
    public createText(){ //пока Text, может быть стоит потом назвать точнее

    }

    public editText(){

    }

    public delText(){

    }


}
