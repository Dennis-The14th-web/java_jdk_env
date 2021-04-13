package randomJavaClasses.src.main.java;
import java.util.*;

public class JavaFuctions2 {
    public static void main(String[] args) 
    {
            /*
            This scanner version prompts users to insert input
            */

            Scanner reader = new Scanner(System.in);
            String inputType;

            System.out.print("Input type (word or sentense): ");
            inputType = reader.next();
            System.out.println("Reversed  string output: " + JavaFuctions2.reverseString(inputType));
            System.out.println("Closing scanner...");
            reader.close();
            System.out.println("Scanner closed");
    }

    public static String reverseString(String str)
    {
    //        StringBuilder strVal = new StringBuilder(str);
    //        strVal.reverse();
    //        return strVal.toString();
    return new StringBuilder(str).reverse().toString();
    }
}


