// CLASS OBJECT
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class classObject{
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "ball";

        pen1.printColor();
        pen2.printColor();

        pen1.write();
    }
}

// CONSTRUCTOR
class Student{
    String name;
    int age;

    public void printfInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class constructor{
    public static void main(String[] args){
        Student s1 = new Student("Ravi", 24);
        s1.printfInfo();
    }
}

// STUDENT CO
 class Student{
    String name;
    int age;

    public void printfInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
 }

class studentCO{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Ravi";
        s1.age = 31;
   
        s1.printfInfo();
    }
}