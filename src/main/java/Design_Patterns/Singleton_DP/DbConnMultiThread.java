package Design_Patterns.Singleton_DP;
/*
When ever we are working in MultiThreaded env there can be inconsistance in checking if instance == null

So
we can make use of Double Check Lock
1. It will take the lock only once while creating the object from the next check it will exit just after checking if (instance == null)
*/
public class DbConnMultiThread {
    public static DbConnMultiThread instance = null;
    String url;
    String password;
    String userName;
    private DbConnMultiThread(){};
    public static DbConnMultiThread getDbConnection()
    {
        if(instance == null)
        {
            synchronized(DbConnMultiThread.class){
                if(instance == null)
                {
                    instance = new DbConnMultiThread();
                }
            }
        }
        return instance;
    }
}
