import java.time.LocalDateTime;

/**
 * Created by lirona on 14/04/2017
 **/
public class Notification {
    String user;
    String action;
    LocalDateTime date;

    public Notification(String user, String action){
        this.user = user;
        this.action = action;
        this.date = LocalDateTime.now();
    }
}


