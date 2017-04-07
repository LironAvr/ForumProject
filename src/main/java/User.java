import com.sun.tools.corba.se.idl.constExpr.Not;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.List;

/**
 * Created by lirona on 06/04/2017
 **/
public class User {

    private boolean isActive;
    private String username;
    private String password;
    private Date signUpDate;
    private Date banStart;
    private int messageCounter;
    private List<User> friends;
    private List<User> pendingRequests;
    private List<Message> messages;
    private List<Thread> threads;
    private List<Group> groups;

    public User (String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }

    public boolean changePassword(String oldPassword, String newPassword){
        throw new NotImplementedException();
    }

    public boolean addFriend(String user){
        throw new NotImplementedException();
    }

    public boolean addFriendRequest(String user){
        throw new NotImplementedException();
    }

    public boolean addMessage(Message message){
        throw new NotImplementedException();
    }

    public boolean deleteMessage(Message message){
        throw new NotImplementedException();
    }

    public boolean editMessage(Message message, String content){ throw new NotImplementedException();}

    public boolean addGroup(Group group){
        throw new NotImplementedException();
    }

    public boolean createThread(SubForum subForum, String content){
        throw new NotImplementedException();
    }

    public boolean deleteThread(SubForum subForum, Thread thread){
        throw new NotImplementedException();
    }

    public int getMessageCounter() { return messageCounter; }
}
