package Structural.Proxy;
/*
Proxy pattern is used when we need to create a wrapper
 to cover the main object’s complexity from the client.

  Like Adapter pattern gives a different interface to its subject, while Proxy patterns provides the same interface from the original object but the decorator provides an enhanced interface. Decorator pattern adds additional behaviour at runtime.
 */

/*
use cases
blocking
caching
pre/post processing
 */
public class Main {
    public static void main(String[] args) throws Exception{
        UserDao dao = new UserDaoProxy();
        dao.createUser("admin", "shubham");
        dao.DeleteUser("abc", "shubham");
    }
}
