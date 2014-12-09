import com.epam.oreshkina.tickets.entity.Event;
import com.epam.oreshkina.tickets.entity.PlaceEvent;
import com.epam.oreshkina.tickets.entity.Seat;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;

/**
 * Created by Viktoriya_Oreshkina on 30-Oct-14.
 */
public class Runner {
   // private static final Logger logger = Logger.getLogger(Runner.class); //чаще всего оно так - имя поля бывает разным - LOGGER logger log итд

    public static void main(String[] args) {
        OutputStream os = null;
        try {
//create object
            Seat seat1 = new Seat(1,2,45,"FREE","PARTERRE",1500);
            Event event1 = new Event(1, "organ", "Lenin street", "01.01.2014", "14:30", seat1);
            Seat seat2 = new Seat(1,2,45,"FREE","PARTERRE",1500);
            Event event2 = new Event(1, "piano", "Stalin street", "02.02.2014", "18:30", seat2);

            PlaceEvent placeEvent = new PlaceEvent(event1, event2);

//create output stream
            File of = new File("concert.xml");
            os = new FileOutputStream(of);
// Marshaling
            JAXBContext context = JAXBContext.newInstance(PlaceEvent.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(placeEvent, os);

            os.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            java.util.logging.Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



















        /*logger.info("this string is printed to log, every log"); //и теперь никаких сисаутов, всё только в лог
        logger.trace("");
        logger.debug("");
        logger.info("");
        logger.warn("");
        logger.error("");
        logger.fatal("");*/

    //}
}
