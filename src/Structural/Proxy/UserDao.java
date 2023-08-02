package Structural.Proxy;


public interface UserDao {
    public void DeleteUser(String role, String user) throws Exception;

    void createUser(String role, String username) throws Exception;
}

