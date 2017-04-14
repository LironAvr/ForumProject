import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.time.LocalDateTime;

/**
 * Created by lirona on 06/04/2017
 **/
public class Thread {

    String owner;
    String content;
    Message message;
    LocalDateTime date;

    public Thread(String owner, String content){
        this.owner = owner;
        this.content = content;
        this.message = new Message();
        this.date = LocalDateTime.now();
    }

    public boolean addFeedback(String user, String content){
        throw new NotImplementedException();
    }

    public boolean deleteThread(String user){ throw new NotImplementedException(); }
}
