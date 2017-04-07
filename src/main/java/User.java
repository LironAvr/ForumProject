import com.sun.tools.corba.se.idl.constExpr.Not;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.List;

/**
 * Created by lirona on 06/04/2017
 **/
public class User {

    boolean isActive;
    String username;
    String password;
    Date signUpDate;
    Date banStart;
    List<User> friends;
    List<User> pendingRequests;
    List<Message> messages;
    List<Thread> threads;
    List<Group> groups;

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
}
