// FACTORIAL
import java.util.*;

class factorial{
    public static int calculateFactorial(int n){
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }
        return factorial;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

    int factorial = calculateFactorial(n);
    System.out.print(factorial);
    }
}

// CALCULATE PRODUCT
import java.util.*;

class multiplyTwoProduct{
    public static int calculateProduct(int a, int b){
        int multiply = a*b;
        return a*b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();

        int m = calculateProduct(a,b);
        System.out.print("Product is: "+m);
    }   
}

// PRINT MY NAME
import java.util.*;

class printMyName{
    public static void printMyName(String name){
        System.out.println("Your name is: "+ name);
        return;
    }

    public static void main(String[] args){
        System.out.print("Enter you name: ");
        Scanner sc = new Scanner (System.in);
        String name = sc.next();

        printMyName(name);
    }
}

// SUM TWO NO.
import java.util.*;

class sumTwoNo{
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum ; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int s = calculateSum(a,b);
        System.out.print(s);
    }
}


