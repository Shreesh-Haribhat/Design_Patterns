package Design_Patterns.Creational_DP.Builder_DP;

public class Student {
    int age;
    String name;
    int height;
    String address;
    int psp;
    String FatherName;

//    public Student(int age,String name,int height,String address,int psp,String fatherName)
//    {
//        this.height = height;
//        this.address =address;
//        this.age = age;
//        this.name = name;
//        this.FatherName = fatherName;
//    }

    private Student(Builder builder) throws IllegalAccessException {

        this.age = builder.getAge();
        this.name = builder.getName();
        this.address = builder.getAddress();
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", address='" + address + '\'' +
                ", psp=" + psp +
                ", FatherName='" + FatherName + '\'' +
                '}';
    }

    public static Builder getBuilder()
    {
        return new Builder();
    }

    //BUILDER


    static class Builder {
        private int age;
        int height;
        private String address;

        private String FatherName;
        private String name;
        int psp;


        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getHeight() {
            return height;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() throws IllegalAccessException {
            if(this.getAge() < 21)
            {
                throw new IllegalAccessException("<-- Loude ke Baal  --> ");
            }
            return new Student(this);
        }

    }

}
