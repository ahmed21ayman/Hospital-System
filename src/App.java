public class App {
    abstract static class Person{
        protected String name;
        protected int age;
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        abstract void showInfo();
    }

    static class Doctor extends Person{
        private String Specialization;
        Doctor(String name, int age, String Specialization){
            super(name, age);
            this.Specialization = Specialization;
        }
        @Override
        void showInfo(){
            System.out.println("Doctor: " + name + " -age: " + age + " -Specialization: "+ Specialization);
        }
    }

    static class Patient extends Person{
        private String disease;
        Patient(String name, int age, String disease){
            super(name, age);
            this.disease = disease;
        }
        @Override
        void showInfo(){
            System.out.println("Patient: " + name + " -age: " + age + " -disease: "+ disease);
        }
    }

    public static void main(String[] args) throws Exception {
        Doctor d1 = new Doctor("ahmed Ayman", 23, "any");
        Patient p1 = new Patient("mahmoud eldb3", 28, "heart");
        p1.showInfo();
        d1.showInfo();
    }
}
