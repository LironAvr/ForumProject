import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

/**
 * Created by lirona on 06/04/2017
 **/
public class Forum implements IForum {

    private String name;
    private HashMap<String, User> users;
    private HashMap<String, SubForum> subForums;
    private HashMap<String, Group> groups;
    private List<User> managers;
    //private List<Group> groups;
    private Policy policy;
    private Logger errorLogger;
    private Logger actionLogger;
    private LocalDateTime creationDate;
    public int messageCounter;

    public Forum(String managerUserName, String managerPassword, String forumName){
        creationDate = LocalDateTime.now();
    }

    @Override
    public boolean createUser(String username, String password) {
        return false;
    }

    @Override
    public boolean removeUser(String username, String password) {
        return false;
    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public boolean deactivateUser(String user) {
        return false;
    }

    @Override
    public boolean activateUser(String user) {
        return false;
    }

    @Override
    public boolean createSubForum(String topic, String moderator) {
        return false;
    }

    @Override
    public boolean deleteSubForum(String topic) {
        return false;
    }

    @Override
    public List<String> getSubForums() {return null; }

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

    @Override
    public List<Message> searchByUser(String user) {
        return null;
    }

    @Override
    public List<Message> searchByContent(String content) {
        return null;
    }

    @Override
    public int getForumCounter() {
        return messageCounter;
    }

    @Override
    public int getUserMessageCounter(String user) {
        throw new NotImplementedException();
    }

    @Override
    public boolean logAction(ForumLog action) {
        if (actionLogger.log(action))
            return true;
        else return false;
    }

    @Override
    public boolean logError(ForumLog error) {
        if (errorLogger.log(error))
            return true;
        else return false;
    }

}
