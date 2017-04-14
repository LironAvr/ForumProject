import java.util.List;

/**
 * Created by lirona on 06/04/2017
 **/
public interface IForum {

    //Users
    public boolean createUser(String username, String password);
    public boolean removeUser(String username, String password);
    public boolean login(String username, String password);
    public boolean deactivateUser(String user);
    public boolean activateUser(String user);

    //Sub Forums
    public boolean createSubForum(String topic, String moderator);
    public boolean deleteSubForum(String topic);
    public List<String> getSubForums();

    //Manager
    public boolean addManager(String username);
    public boolean removeManager(String username);

    //Groups
    public boolean createGroup(String groupName);
    public boolean deleteGroup(String groupName);

    //Policy
    public boolean createPolicy();
    public boolean editPolicy();

    //Search
    public List<Message> searchByUser(String user);
    public List<Message> searchByContent(String content);

    //Info
    public int getForumCounter();
    public int getUserMessageCounter(String user);

    //Loggers
    public boolean logAction(ForumLog action);
    public boolean logError(ForumLog error);
}
