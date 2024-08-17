package Design_Patterns.Singleton_DP;

/*

This will work fine in Non-Multithreaded enveronment

Steps to Make Singletin class
1. Make Constructor Private
2. Create a static method which will return object of a particular class
3. Have a variable of the class time initialized to null initially return new Object if the instance is null.

*/

public class DbConnection {
    static DbConnection instance = null;
    String host;
    String password;
    String userName;
    private DbConnection(){};
    public static DbConnection getDbConnection()
    {
        if(instance == null)
        {
            instance = new DbConnection();
        }
        return instance;
    }
}
