import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lirona on 06/04/2017
 **/
public class SubForum implements ISubForum {

    private String topic;
    private List<Moderator> moderators;
    private List<Thread> threads;
    private LocalDateTime date;

    public SubForum(String topic, User moderator, int permissions){
        this.topic = topic;
        this.moderators = new ArrayList<Moderator>();
        this.moderators.add(new Moderator(moderator, permissions));
        this.date = LocalDateTime.now();
    }

    @Override
    public boolean addModerator(User user) {
        return false;
    }

    @Override
    public boolean removeModerator(String username) {
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
