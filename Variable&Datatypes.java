// HELLO WORLD
class hW{
    public static void main(String[] args){
        System.out.print("Hello World");
    }
}

// PRINT AGE
import java.util.Scanner;

class printAge{
    public static void main(String[] args){
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.print("The age is: "+ age);
    }
}

// AREA OF SQUARE
import java.util.Scanner;

class arOfSq{
    public static void main(String[] args){
        System.out.print("Enter the value of side: ");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side*side;
        System.out.print("The area of square is: "+ area);
    }
}

// AREA OF CIRCLE
import java.util.Scanner;

class arOfCircle{
    public static void main(String[] args){
        double pi = 3.14;
        System.out.print("Enter the value of r: ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = pi*r*r;
        System.out.print("The area of circle is: "+ area);
    }
}

// ADDING TWO NUMBERS
import java.util.Scanner;

class addingTwoNo{
    public static void main(String[] args){
        System.out.print("Enter the value of a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("The sum is: "+ sum);
    }
}