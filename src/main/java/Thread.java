import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.List;

/**
 * Created by lirona on 06/04/2017
 **/
public class Thread {

    String owner;
    String content;
    Message message;

    public boolean addFeedback(String user, String content){
        throw new NotImplementedException();
    }

    public boolean deleteThread(String user){ throw new NotImplementedException(); }
}
