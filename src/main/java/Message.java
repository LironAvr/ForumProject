import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Created by lirona on 06/04/2017
 **/
public class Message {
    String owner;
    String content;
    List<Message> feedbacks;

    public boolean addFeedback(String user, String content){
        throw new NotImplementedException();
    }

    public boolean editMessage(String content){
        throw new NotImplementedException();
    }
}
