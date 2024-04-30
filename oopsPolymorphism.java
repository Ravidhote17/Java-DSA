// METHOD OVERLOADING
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.print(name);
    }
    
    public void printInfo(int age){
        System.out.print(name);
    }
    
    public void printInfo(String name, int age){
        System.out.print(name + " " +age);
    }
}

public class methodOverlading{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "ravi";
        s1.age = 24;

        // s1.printInfo(s1.age);
        // s1.printInfo(s1.name);
        s1.printInfo(s1.name, s1.age);
    }
}

