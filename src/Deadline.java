import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deadline extends Event implements Completable{
    private boolean complete;


    public Deadline(String name, LocalDateTime deadline){
        super(name, deadline);
        this.complete = false;
    }
    @Override
    public void complete(){
        this.complete = true;
    }
    @Override
    public boolean isComplete(){
        return complete;
    }

}
