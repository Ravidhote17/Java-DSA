// STRING
class string{
    public static void main(String[] args){
        String name = "Ravi Dhote";
        System.out.print(name);
    }
}

// SUB STRING
import java.util.*;

class subStrings{
    public static void main(String[] args){
        String sentence = "My name is Anthony Ginsolwick";
        String name = sentence.subString(0, 4);
        System.out.print(name);
    }
}

// STRING BUILDER
import java.util.*;

class stringBuilder{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Ravi");
        System.out.println(sb);

        //char print
        System.out.println(sb.charAt(0));

        //replacing word in string
        sb.setCharAt(0,'P');
        System.out.print(sb);
    }
}

// STRING BUILDER INSERT
class sbInsert{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");

        //insert
        sb.insert(2,'n');
        System.out.println(sb);

        //delete
        sb.delete(2,3);
        System.out.println(sb);

        //append
        sb.append("e");
        System.out.println(sb);

        //length
        System.out.print(sb.length());
    }
}

// REVERSE STRING
class reverseString{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Ravi");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
        }
    }

// PRINT CHARACTER
class printChar{
    public static void main(String[] args){
        String name = "Ravi";

        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}

// INPUT STRING
class printChar{
    public static void main(String[] args){
        String name = "Ravi";

        for(int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}

// COMPARE STRING
class compareString{
    public static void main(String[] args){
        String name1 = "Ravi";
        String name2 = "Ravi";

        // str1>str2 = +ve value
        // str1<str2 = -ve value
        // str1==str2 = 0 
        
        if(name1.compareTo(name2)==0){
            System.out.print("Strings are Equal");
        }
        else{
            System.out.print("Strings are not Equal");
        }
    }
}

