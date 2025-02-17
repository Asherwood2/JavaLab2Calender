import java.time.Duration;
import java.time.LocalDateTime;

class Meeting extends Event implements Completable{
    private LocalDateTime end;
    private String location;
    private boolean complete;


    public Meeting(String name, LocalDateTime start, LocalDateTime end, String location) {
        super(name, start);
        this.end = end;
        this.location = location;
        this.complete = false;
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
        return Duration.between(dateTime, end);
    }
    public String getLocation(){
        return location;
    }
    public void setEndTime(LocalDateTime end){
        super.setDateTime(end);
    }
    public void setLocation(String location){
        this.location = location;
    }




}
