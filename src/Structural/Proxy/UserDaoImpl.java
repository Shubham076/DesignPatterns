package Structural.Proxy;

public class UserDaoImpl implements UserDao {
    @Override
    public void createUser(String role, String user) throws Exception {
        System.out.println("created user");
    }

    @Override
    public void DeleteUser(String role, String user) throws Exception {
        System.out.println("Deleted user");
    }
}
