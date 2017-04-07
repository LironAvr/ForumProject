/**
 * Created by lirona on 06/04/2017
 **/
public interface IForum {

    //Users
    public boolean createUser(String username, String password);

    //Sub Forums
    public boolean createSubForum();

    //Manager
    public boolean addManager(String username);
    public boolean removeManager(String username);

    //Groups
    public boolean createGroup(String groupName);
    public boolean deleteGroup(String groupName);

    //Policy
    public boolean createPolicy();
    public boolean editPolicy();
}
