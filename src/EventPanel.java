import javax.swing.*;

public class EventPanel extends JPanel {
    private Event event;
    private Jbutton completeButton;

    EventPanel(Event event) {
        this.event = event;
        JButton completeButton = new JButton("Complete");
    }
}
