import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public abstract class Event implements Comparable<Event> {

    protected String name;
    protected LocalDateTime dateTime;
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public Event(String name, LocalDateTime dateTime){
        this.name = name;
        this.dateTime = dateTime;
    }
    public String getName(){
        return name;
    }

    public String getDateTime(){
        return dateTime.format(formatter);
    }
    public void setDateTime(LocalDateTime dateTime){
        this.dateTime = dateTime;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public int compareTo(Event e){
        return this.dateTime.compareTo(e.dateTime);
    }
}
