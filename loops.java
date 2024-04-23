// A TO Z 
class aToZ{
    public static void main(){
        for(char i='a'; i<='z'; i++){
            System.out.println(i);
        }
    }
}

// DO WHILE LOOP
class doWhileLoop{
    public static void main(String[] args){
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}

// 50 TO 10
class fiftyToTen{
    public static void main(String[] args){
        int i=50;
        do{
            System.out.print(i);
            i--;
        }while(i>=0);
    }
}

// FOR LOOP
class forLoop{
    public static void main(String[] args){
        for(int i=0; i<11; i++){
            System.out.print(i+" ");
        }
    }
}

// SUM OF N
import java.util.Scanner;

class sumOfN{
    public static void main(String[] args){
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = i+sum;
            sum++;
        }
        System.out.print(sum);
    }
}

// TABLE OF N
import java.util.Scanner;

class table{
    public static void main(String[] args){
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
}

// 10 TO 1
class tenToOne{
    public static void main(String[] args){
        for(int i=10; i>=1; i--){
            System.out.println(i);
        }
    }
}

// WHILE LOOP
class whileLoop{
    public static void main(String[] args){
        int i=0;
        while(i<11){
            System.out.println(i);
            i++;
        }
    }
}

// ZERO TO N
import java.util.Scanner;

class zeroToN{
    public static void main(String[] args){
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        } 
    }
}