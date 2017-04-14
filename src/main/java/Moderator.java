import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by lirona on 07/04/2017
 **/
public class Moderator extends User {

    LocalDateTime start;
    List<Complaint> complaints;
    int permissions;

    public Moderator(User user, int permissions){
        super(user.getUsername(), user.getPassword());
        this.start = LocalDateTime.now(); //TODO: implement date
        this.permissions = permissions;
    }

    public boolean addComplaint(String user, String complaint){ throw new NotImplementedException(); }
    public int changePermissions(int permission){ throw new NotImplementedException(); }
}
