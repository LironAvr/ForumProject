import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by lirona on 06/04/2017
 **/
public class Message {
    String owner;
    String content;
    LocalDateTime date;

    public boolean editMessage(String content){
        throw new NotImplementedException();
    }
}
