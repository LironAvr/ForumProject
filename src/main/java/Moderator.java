import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.List;

/**
 * Created by lirona on 07/04/2017
 **/
public class Moderator extends User {

    Date start;
    List<Complaint> complaints;
    int permissions;

    public Moderator(User user, int permissions){
        super(user.getUsername(), user.getPassword());
        this.start = null; //TODO: implement date
        this.permissions = permissions;
    }

    public boolean addComplaint(String user, String complaint){ throw new NotImplementedException(); }
    public int changePermissions(int permission){ throw new NotImplementedException(); }
}
