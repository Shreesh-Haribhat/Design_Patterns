package Design_Patterns.Creational_DP.Prototype_and_Registry_DP;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    Map<String,Student> map = new HashMap<>();

    public void register(String key, Student student)
    {
        map.put(key,student);
    }

    public Student get(String key)
    {
        return map.get(key);
    }

}
