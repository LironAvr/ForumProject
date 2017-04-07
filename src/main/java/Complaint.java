import java.util.Date;

/**
 * Created by lirona on 07/04/2017
 **/
public class Complaint {

    private String user;
    private Date date;
    private String complaint;

    public Complaint(String user, String complaint){
        this.user = user;
        this.complaint = complaint;
        this.date = null; //TODO: Implement date initiation
    }

    public String getUser(){ return user; }
    public String getComplaint(){ return complaint; }
    public Date getDate(){ return date; }
}
