//ABSTRACTION

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

        Animal animal = new Animal();
        animal.walk();
    }
}

// INTERFACE

interface Animal {
    int eyes = 2;
    void walk();
}

interface Herbivore{

}

class Horse implements Animal, Herbivore{           // Multiple inheritance through interface
    public void walk(){
        System.out.printf("Walks on 4 legs");
    }
}

public class interface{
    public static void main(String[] args){
        Horse horse = new Horse();
        horse.walk();
    }
}
