import java.util.HashMap;
import java.util.List;

/**
 * Created by lirona on 06/04/2017
 **/
public class Forum implements IForum {

    private HashMap<String, User> users;
    private HashMap<String, SubForum> subForums;
    private List<User> managers;
    private List<Group> groups;
    private Policy policy;
    private Logger errorLogger;
    private Logger actionLogger;


    @Override
    public boolean createUser(String username, String password) {
        return false;
    }

    @Override
    public boolean createSubForum() {
        return false;
    }

    @Override
    public boolean addManager(String username) {
        return false;
    }

    @Override
    public boolean removeManager(String username) {
        return false;
    }

    @Override
    public boolean createGroup(String groupName) {
        return false;
    }

    @Override
    public boolean deleteGroup(String groupName) {
        return false;
    }

    @Override
    public boolean createPolicy() {
        return false;
    }

    @Override
    public boolean editPolicy() {
        return false;
    }
}
