import java.time.LocalDate;
import java.time.LocalDateTime;

public class Event {

    protected String name = "";
    protected LocalDateTime dateTime;

    public Event(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public LocalDateTime getDateTime(){
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime){
        this.dateTime = dateTime;
    }
    public void setName(String name){
        this.name = name;
    }
    public int compareTo(Event e){
        int compare;
        compare = dateTime.compareTo(e.dateTime);
        return compare;
    }
}
