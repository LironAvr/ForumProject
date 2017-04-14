import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Created by lirona on 14/04/2017
 **/
public class ThreadMessage extends Message {
    List<Message> feedbacks;

    public ThreadMessage(){
        super();
    }

    public boolean addFeedback(String user, String content){
        throw new NotImplementedException();
    }
}
