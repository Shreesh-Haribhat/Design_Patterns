package Design_Patterns.Creational_DP.Prototype_and_Registry_DP;

public class IntelligentStudent extends Student{
    int iq;

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent intelligentStudent)
    {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    @Override
    public IntelligentStudent clone()
    {
       // IntelligentStudent intelligentStudent = new IntelligentStudent();
       // intelligentStudent.iq = this.iq;
//        intelligentStudent.setAge();
//        intelligentStudent.setName();
//        intelligentStudent.setPsp();
//        intelligentStudent.setAvgBatchPsp();

        //return intelligentStudent;
        return new IntelligentStudent(this);
    }


}
