import javax.swing.*;
import java.awt.*;

/*public class EventPanel extends JPanel {
    private Event event;
    //private Jbutton completeButton;

    EventPanel(Event event) {
        this.event = event;
        JButton completeButton = new JButton("Complete");

        if (event instanceof Completable== false) {
            completeButton.setVisible(true);
        }
    }



    private void createCompleteButton(Event event) {
        if (Completable.class.isAssignableFrom(event.getClass())) {
            JButton completeButton = new JButton("Complete");
            completeButton.addActionListener(e -> {
                ((Completable) event).complete();
                completeButton.setEnabled(false);
            });
            add(completeButton, BorderLayout.SOUTH);
        }
    }

}
*/
class EventPanel extends JPanel {
    private Event event;
    private JButton completeButton;

    public EventPanel(Event event) {
        this.event = event;
        setLayout(new BorderLayout());

        JLabel nameLabel = new JLabel("Name: " + event.getName());
        JLabel dateLabel = new JLabel("Date: " + event.getDateTime());
        add(nameLabel, BorderLayout.NORTH);
        add(dateLabel, BorderLayout.CENTER);

        if (event instanceof Completable) {
            completeButton = new JButton("Complete");
            completeButton.addActionListener(e -> {
                ((Completable) event).complete();
                completeButton.setEnabled(false);
            });
            add(completeButton, BorderLayout.SOUTH);
        }
    }
}