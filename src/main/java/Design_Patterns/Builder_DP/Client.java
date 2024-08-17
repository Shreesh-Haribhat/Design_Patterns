package Design_Patterns.Builder_DP;

public class Client {
    public static void main(String[] args) throws IllegalAccessException {
        Student student = Student.getBuilder()
                .setName("Shreesh")
                .setHeight(1243)
                .setAddress("Hoysal Nagar")
                .setAge(25)
                .build();

        System.out.println(student);
    }

}
