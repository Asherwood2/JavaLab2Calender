import java.time.LocalDateTime;

public class Deadline extends Event implements Completable{
    private boolean complete;
    private LocalDateTime deadline;
    Deadline(String name, LocalDateTime dateTime){
        super(name);
    complete = false;
    dateTime = deadline;
    }
    @Override
    public void complete(){
    complete = true;
    }
    @Override
    public boolean isComplete(){
        return complete;
    }

}
