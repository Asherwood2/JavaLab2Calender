import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class EventTester {
    //private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static void main(String[] args) {
    Deadline1();
    Deadline2();
    meeting1();
    meeting2();

        System.out.println("tests are completed");
        }

    public static void Deadline1(){
        LocalDateTime datetime = LocalDateTime.of(2025, 4, 22, 11, 59);
        Deadline Deadline1 = new Deadline("Implementing code for time machine", datetime);
        System.out.println(Deadline1.getName());
        System.out.println(Deadline1.getDateTime()); // Use formatter here
        System.out.println(Deadline1.getDateTime());
        System.out.println(Deadline1.isComplete());
        Deadline1.complete();
        System.out.println(Deadline1.isComplete());
    }
    public static void Deadline2() {
        LocalDateTime datetime = LocalDateTime.of(2025, 3, 30, 11, 59);
        Deadline Deadline2 = new Deadline("Homework", datetime);
        System.out.println(Deadline2.getName());
        System.out.println(Deadline2.getDateTime());
        System.out.println(Deadline2.isComplete());
        Deadline2.complete();
        System.out.println(Deadline2.isComplete());
    }
    public static void meeting1(){
        LocalDateTime Start_time = LocalDateTime.of(2025, 3, 30, 14, 0);
        LocalDateTime End_time = LocalDateTime.of(2025, 3, 30, 15, 0);
            Meeting meeting1 = new Meeting("Meeting for goals before summer", Start_time, End_time, "2nd floor conference room");
    }
    public static void meeting2(){
        LocalDateTime Start_time = LocalDateTime.of(2025, 4, 1, 10, 0);
        LocalDateTime End_time = LocalDateTime.of(2025, 4, 1, 11, 0);
        Meeting meeting1 = new Meeting("Follow up on code for time machine", Start_time, End_time, "Remote");
    }
}



