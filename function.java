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

// AGE
import java.util.*;

class age{
    public static void ageVote(int age){
        if(age>18){
            System.out.print("You can Vote");
        }else{
            System.out.print("You can not Vote");            
        }

        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        ageVote(age);
    }
}

// AVERAGE
import java.util.*;

class average{
    public static int calcAverage(int a, int b, int c){
        int average = (a+b+c)/3;
        return average;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();       
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        int avg = calcAverage(a,b,c);
        System.out.print(avg);

    }
}

// CIRCUMFERENCE
import java.util.*;

class circumference{
public static double calcCircum(double r){
    double pi = 3.14;
    double circum = 2*pi*r;

    return circum; 

}

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of r: ");
        double r = sc.nextDouble();

        double c = calcCircum(r);
        System.out.print(c);
    }

}

// GREATER NO. 
import java.util.*;

class greaterNo{
    public static void greater(int a, int b){
        if(a>b){
            System.out.print("The greater no. is: "+a);
        }else{
            System.out.print("The greater no. is: "+b);
        }
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

    greater(a, b);
    }
}

// INFINITE LOOP
class infiniteLoop{
    public static void main(String[] args){
        do{
            System.out.println("Hello World");
        }while(true);
    }
}

// POWER
import java.util.*;

class power{
    public static int calcPower(int x, int n){
        int power = pow(x,n);

        returns power;
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of x");
        int x = sc.nextInt();
        System.out.print("Enter the value of n");
        int n = sc.nextInt();

        int p = power(x, n);
        System.out.print(p);
    }
}

// SUM OF ODD NO.
import java.util.*;

class sumOfOddNo{
    public static int calcSum(int n){
        int sum = 0;
            for(int i=1; i<=n; i=i+2){
                sum = sum+i;
            }
        return sum;        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

    int s = calcSum(n);
    System.out.print(s);
    }
}
