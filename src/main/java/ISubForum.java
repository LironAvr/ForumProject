/**
 * Created by lirona on 06/04/2017
 **/
public interface ISubForum {

    //Manager
    public boolean addModerator(User user);
    public boolean removeModerator(String username);

    //Threads
    public boolean createThread();
    public boolean removeThread();
}
