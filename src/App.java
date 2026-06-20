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
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
