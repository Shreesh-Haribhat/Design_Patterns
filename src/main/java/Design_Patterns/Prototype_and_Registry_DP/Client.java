package Design_Patterns.Prototype_and_Registry_DP;

public class Client {
    public static void registerStudents(StudentRegistry studentRegistry)
    {
        Student student_prototype = new Student();
        student_prototype.setAvgBatchPsp(89.90);
        student_prototype.setBatch("<- DSML ->");

        studentRegistry.register("DSML",student_prototype);

        IntelligentStudent intelligentStudent_prototype = new IntelligentStudent();
        intelligentStudent_prototype.setIq(143);
        intelligentStudent_prototype.setBatch(" DSML ");
        intelligentStudent_prototype.setAvgBatchPsp(98.23);

        studentRegistry.register("Intelligent Batch",intelligentStudent_prototype);
    }
    public static void main(String args[])
    {
        StudentRegistry studentRegistry = new StudentRegistry();
        registerStudents(studentRegistry);


        Student shreesh = studentRegistry.get("DSML").clone();
        shreesh.setAge(25);
        shreesh.setName("Haribhat");
        shreesh.setPsp(99.99);

        Student shreesh_haribat = studentRegistry.get("Intelligent Batch").clone();
        shreesh_haribat.setPsp(100);
        shreesh_haribat.setName("Shreesh-->");
        shreesh_haribat.setAge(25);


        System.out.println(shreesh);
        System.out.println(shreesh_haribat);
    }
}
