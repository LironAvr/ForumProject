import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lirona on 06/04/2017
 **/
public class User {

    private boolean isActive;
    private int messageCounter;
    private String username;
    private String password;
    private LocalDateTime signUpDate;
    private LocalDateTime banStart;
    private List<User> friends;
    private List<User> pendingRequests;
    private List<Message> messages;
    private List<Thread> threads;
    private List<Group> groups;
    private List<Notification> notifications;

    public User (String username, String password){
        this.username = username;
        this.password = password;
        this.signUpDate = LocalDateTime.now();
        this.messageCounter = 0;
        this.isActive = true;
        this.friends = new ArrayList<User>();
        this.pendingRequests = new ArrayList<User>();
        this.messages = new ArrayList<Message>();
        this.threads = new ArrayList<Thread>();
        this.groups = new ArrayList<Group>();
        this.notifications = new ArrayList<Notification>();
    }

    public String getUsername() { return username; }

    public String getPassword() { return password; }

    public boolean activate(){
        this.isActive = true;
        return true;
    }

    public boolean deactivate(){
        this.isActive = false;
        return true;
    }

    public boolean isActive(){ return this.isActive; }

    public boolean changePassword(String oldPassword, String newPassword){
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        }
        else return false;
    }

    public boolean addFriend(User user){
        throw new NotImplementedException();
    }

    public boolean addFriendRequest(User user){
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
