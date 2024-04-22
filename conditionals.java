// IF ELSE
import java.util.Scanner;

class age{
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        if(age>18){
            System.out.print("You are adult");
        }
        else if(13<age && age<18){
            System.out.print("You are Old");
        }
        else{
            System.out.print("Thank You!");
        }
    }
}

// NESTED IF ELSE
import java.util.Scanner;

class nested{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        if(n>0){
            System.out.println("n is positive");
            if(n%2==0){
                System.out.print("n is even");
            }
            else{
                System.out.print("n is odd");
            }
        }
    }
}

// SWITCH CASE
import java.util.Scanner;

class switchCaseChar{
    public static void main(String[] args){
        char day;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the day: ");
        day = sc.next().charAt(0);

        switch(day){
            case 'm': System.out.println("Monday");
            break;
            case 't': System.out.println("Tuesday");
            break;
            case 'w': System.out.println("Wednesday");
            break;
            case 'T': System.out.println("Thrusday");
            break;
            case 'f': System.out.println("Friday");
            break;
            case 's': System.out.println("Saterday");
            break;
            case 'S': System.out.println("Sunday");
            break;
            default: System.out.print("Not a valid day!");
        }
    }
}

// SWITCH CASE IN INTEGER
import java.util.Scanner;

class switchCaseInt{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the day(1-7): ");
        n = sc.nextInt();
        switch(n){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;            
            case 3: System.out.println("Wednesday");
            break;            
            case 4: System.out.println("Thrusday");
            break;            
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;            
            case 7: System.out.println("Sunday");
            break;
            default: System.out.print("Not a valid day!");
        }
    }
}