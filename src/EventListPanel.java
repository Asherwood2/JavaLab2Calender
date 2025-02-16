import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Collections;

public class EventListPanel extends JPanel {
    ArrayList<Event> events;
    JPanel controlPanel;
    JPanel displayPanel;
    JComboBox sortDropDown;
    JCheckBox filterDisplay;
    JButton addEventButton;


    EventListPanel() {

    events = new ArrayList<>();

        //JComboBox to sort events
        sortDropDown = new JComboBox();
        sortDropDown.addItem("name");
        sortDropDown.addItem("Descending name");
        sortDropDown.addItem("date");
        sortDropDown.addItem("Descending time");

        sortDropDown. addActionListener(e -> {
            String selectedItem = (String) sortDropDown.getSelectedItem();

            if (selectedItem.equals("name")) {
                Collections.sort(events);
            }
            else if (selectedItem.equals("Descending name")) {
                Collections.sort(events, Collections.reverseOrder());
            }
            else if (selectedItem.equals("date")) {
                events.sort((event1, event2) -> event1.getDateTime().compareTo(event2.getDateTime()));
            }
            else if (selectedItem.equals("Descending time")) {
                events.sort((event1, event2) -> event2.getDateTime().compareTo(event1.getDateTime()));
            }
        });

        //task checkbox for displaying different tasks
        //filterDisplay = new JCheckBox("Event filter");
        //filterDisplay.addItemListener(new java.awt.event.ItemListener() {
          //                                  public void itemStateChanged(ItemEvent e) {

            //                                });
              //                          };




        //Jbutton for adding events
        addEventButton = new JButton("Add Event");
        addEventButton.addActionListener(e -> {
        new AddEventModal(SwingUtilities.getWindowAncestor(EventListPanel.this));
        });
        };
}




