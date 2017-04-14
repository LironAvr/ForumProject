import java.time.LocalDateTime;

/**
 * Created by lirona on 14/04/2017
 **/
public class ForumLog {
    String username;
    String action;
    LocalDateTime date;

    public ForumLog(String username, String action){
        this.username = username;
        this.action = action;
        this.date = LocalDateTime.now();
    }

    @Override
    public String toString(){
        String log = "";
        //TODO: assemble Log to String
        return log;
    }
}
