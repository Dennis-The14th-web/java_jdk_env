package DeclarationOfIndependence.src.main.java.DeclarationOfIndependence;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
//import java.util.Arrays;
//import java.util.List;
/**
 *
 * @author dennisthe14th
 */
public class DeclarationOfIndependence {
    public static void main(String[] args) throws FileNotFoundException 
    {   
        //Set the delimiter used in file
        try ( //Get scanner instance
                Scanner scanner = new Scanner(new File("src/Files/decFile.csv"))) {
            //Set the delimiter used in file
            scanner.useDelimiter(",");
            
            //Get input string of the scanner object
            String string = scanner.nextLine();
            
            //Defined count
            int count;
            
            //Converts the string into lowercase
            string = string.toLowerCase();

          
            //Split the string into words using built-in function
           
            //excluding these words "of", "the", "to", "and","for"
            String replaceString = string.replace("of", "")
                      .replace("the", "").replace("to", "")
                     .replace("and", "").replace("for", "");

             String words[] = replaceString.split("([,-.\\s]+)");

        System.out.println("100 MOST COMMON WORDS IN THE DECLARATION OF INDEPENDENCE: ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i + 1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    //Set words [j] to 0 to avoid visited word
                    words[j] = "0";
                }
            
         }        

            //Display the duplicated word if counts is greate than 1
              if(count > 1 && words[i] != "0")
                System.out.println(count + " " + "," + " " + words[i]);
              
        }
         scanner.close(); 
    }
}

}
