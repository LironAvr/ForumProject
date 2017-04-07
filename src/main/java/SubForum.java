import java.util.List;

/**
 * Created by lirona on 06/04/2017
 **/
public class SubForum implements ISubForum {

    private List<User> moderators;
    private List<Thread> threads;

    @Override
    public boolean addManager(String username) { return false; }

    @Override
    public boolean removeManager(String username) {
        return false;
    }

    @Override
    public boolean createThread() {
        return false;
    }

    @Override
    public boolean removeThread() {
        return false;
    }


}
