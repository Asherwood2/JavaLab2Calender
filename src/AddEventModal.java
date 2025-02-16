import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class AddEventModal extends JDialog {



    public AddEventModal(Window parent){
        String name = "Deadline or Meeting";
        LocalDateTime time = LocalDateTime.now();
        Deadline event = new Deadline(name, time);
    }

}
