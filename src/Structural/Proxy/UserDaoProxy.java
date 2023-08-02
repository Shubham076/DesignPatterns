package Structural.Proxy;

public class UserDaoProxy implements UserDao{
    UserDaoImpl userDao;
    public UserDaoProxy() {
        this.userDao = new UserDaoImpl();
    }
    @Override
    public void DeleteUser(String role, String user) throws Exception {
        if (!role.equals("admin")) {
            throw new Exception("Access Denied");
        }
        userDao.DeleteUser(role,  user);
    }

    @Override
    public void createUser(String role, String user) throws Exception {
        if (!role.equals("admin")) {
            throw new Exception("Access Denied");
        }
        userDao.createUser(role,  user);
    }
}
