import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Created by lirona on 06/04/2017
 **/
public class Logger {

    private List<ForumLog> logs;

    public boolean log(ForumLog log){
        throw new NotImplementedException();
    }

    public List<ForumLog> getLogs() { return logs; }
}
