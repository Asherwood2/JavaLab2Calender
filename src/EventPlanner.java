import javax.swing.*;





public class EventPlanner{

public static void addDefaultEvents(EventListPanel event){

}




    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    EventListPanel event = new EventListPanel();
    }
}
