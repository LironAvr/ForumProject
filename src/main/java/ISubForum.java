/**
 * Created by lirona on 06/04/2017
 **/
public interface ISubForum {

    //Manager
    public boolean addManager(String username);
    public boolean removeManager(String username);

    //Threads
    public boolean createThread();
    public boolean removeThread();
}
