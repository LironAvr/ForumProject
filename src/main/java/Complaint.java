import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by lirona on 07/04/2017
 **/
public class Complaint {

    private String user;
    private LocalDateTime date;
    private String complaint;

    public Complaint(String user, String complaint){
        this.user = user;
        this.complaint = complaint;
        this.date = LocalDateTime.now();
    }

    public String getUser(){ return user; }
    public String getComplaint(){ return complaint; }
    public LocalDateTime getDate(){ return date; }
}
