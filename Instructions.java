// AVERAGE

import java.util.Scanner;

class average{
    public static void main(String[] args){
        // int a,b,c;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int c = sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.print("The average is: "+ avg);
    }
}

// ARITHMETIC

import java.util.math;

class arithmetic{
    public static void main(String[] args){
    int a = 5-2/2+3;
    System.out.print(a);
    }
}