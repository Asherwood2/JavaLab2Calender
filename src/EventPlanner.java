import javax.swing.*;
import java.awt.*;


public class EventPlanner{

public static void addDefaultEvents(EventListPanel event){

}

    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setLocationRelativeTo(null);
        //frame.getContentPane().setBackground(Color.CYAN);
    EventListPanel eventListPanel = new EventListPanel();
    frame.add(eventListPanel);

    //eventListPanel.setBackground(Color.BLUE);
    frame.setVisible(true);

    }
}
