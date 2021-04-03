package DeclarationOfIndependence.src.main.java;
import java.util.*;

public class TempConverter {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        char inputType;
        char outputType;
        float inputValue;
        // float returnValue;
        
        System.out.print("Input type (F/C/K): ");
        inputType = reader.next().charAt(0);
        System.out.print("Output type (F/C/K): ");
        outputType = reader.next().charAt(0);
        System.out.print("Temperature: ");
        inputValue = reader.nextFloat();
        
        //Switching btw cases in the intput
        switch(inputType)
        {
            case 'F':
                inputValue = fToC(inputValue);
                break;
            case 'C':
                break;
            case 'K':
                inputValue = fToC(kToF(inputValue));
                break;
            default:
                System.exit(1);
        }
        
        //Switching btw cases in the output
        switch(outputType)
        {
            case 'F':
                inputValue = kToF(cToK(inputValue));
                break;
            case 'C':
                break;
            case 'K':
                inputValue = cToK(inputValue);
                break;
            default:
                System.exit(1);
        }
        
        System.out.println(inputValue);
        reader.close();
    }
    
    //Method to convert fahrenheit to celsius
    public static float fToC(float fVal)
    {
        return ((fVal-32.0f)*5.0f)/9.0f;
    }

    //Method to convert kelvin to fahrenheit
    public static float kToF(float kVal)
    {
        return (((kVal-273.15f)*9.0f)/5.0f)+32.0f;
    }

    //Method to convert celsius to kelvin
    public static float cToK(float cVal)
    {
        return cVal+273.15f;
    }
}
    
