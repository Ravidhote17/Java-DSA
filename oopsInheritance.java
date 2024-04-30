// ABSTRACTION

abstract class Animal{
    abstract void walk();               // this is abstract class as we don't want to see them
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on four leg");
    }
}

class Chcken extends Animal{
    public void walk(){
        System.out.println("Walk on four leg");
    }
}

class abstraction{
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();

        Animal animal = new Animal();           // Animal is abstract; cannot be instantiated
        animal.walk();
    }
}

// HIRARCHICAL INHERITANCE
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Traingle extends Shape{
    public void(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void(int r){
        System.out.println(3.14*r*r);
    }
}

class hirarchicalInherit{
    public static void main(String[] args){

    }
}

// INHERITANCE
class Shape{
    String color;
}

class Traingle extends Shape{

}

class inherit{
    public static void main(String[] args){
        Traingle t1 = new Traingle();
        t1.color = "red"; 
    }
}

// MULTIPLE INHERITANCE
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Traingle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateraltTraingle extends Traingle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}   


class multiInherit{
    public static void main(String[] args)}{

    }
}

// SINGLE INHERITANCE
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Traingle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class singleInherit{
    public static void main(String[] args);
}

