import java.time.Duration;
import java.time.LocalDateTime;

public class Meeting extends Event implements Completable{
    private LocalDateTime start;
    private LocalDateTime end;
    private String location;
    private boolean complete;


    Meeting(String name, LocalDateTime start, LocalDateTime end, String location) {
        super(name);
        this.start = start;
        this.end = end;
        this.location = location;
        complete = false;
    }
    @Override
    public void complete(){
        complete = true;
    }
    @Override
    public boolean isComplete(){
        return complete;
    }
    public LocalDateTime getEndTime(){
        return end;
    }
    public Duration getDuration(){
        return Duration.between(start, end);
    }



}
