package randomJavaClasses.src.main.java;
import java.util.*;

public class JavaFunctions {
    public static void main(String[] args){
        String inputType = "ABC";
        String inputVal = "ABA";
        int num1 = 50;
        int num2 = 10;
        System.out.println("Reversed string output: " + JavaFunctions.reverseString(inputType));
        System.out.println("isPalindrome string output: " + JavaFunctions.isPalindrome(inputVal));
        System.out.println("randBetween int output: " + JavaFunctions.randBetween(num1, num2));

    }
    
    public static String reverseString(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
    
    public static String isPalindrome(String str)
    {
        int start = 0;
        int end = str.length() -1;
        boolean isPalindrome = true;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        String result;
        if(isPalindrome){
            result = "True";
//            System.out.println(result);
        } else {
            result = "False";
//            System.out.println(result);
        }
        return result;
    }
    
    public static int randBetween(int max, int min)
    {
        int result = ((int) (Math.random() * (max - min))) + min; 
        return result ;
    }
}