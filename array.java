// ARRAY
class array{
    public static void main(String[] args){
        int[] marks = new int [3];
        marks[0] = 4;
        marks[1] = 7;
        marks[2] = 5;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}

// ARRAY INPUT
import java.util.*;

class arrInput{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();

        int number[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        // output
        for(int i=0; i<size; i++){
            System.out.println(number[i]);
        }
    }
}

// ARRAY LOOP
class arrLoop{
    public static void main(String[] args){
        int marks[] = {652,642,64,64,40,485,668};
        for(int i=0; i<8; i++){
            System.out.println(marks[i]);
        }
    }
}

// FIND X IN ARRAY
import java.util.*;

class findXarr{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();

        int number[] = new int[size];

        //input 
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // output
        for(int i=0; i<number.length; i++){
            if(number[i]==x){
                System.out.println("x found at index: "+ i);
            }
        }
    }
}

// FIND X IN 2D ARRAY
import java.util.*;

class findXtwoDarr{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int number[][] = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                number[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(number[i][j]==x){
                    System.out.println("x is found at: "+i+""+j);
                }
            }
        }

    }
}

// 2D ARRAY OUTPUT
import java.util.*;

class twoDarrIO{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        // input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i=0; i<rows; i++){
            for(int j=0; i<cols; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}