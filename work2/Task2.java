import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task2 {
    public static void main(String[] args)
        throws IOException
    {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        String input = reader.readLine();

        try{
            int number = Integer.parseInt(input);
            double result = number * 453.6;
            System.out.print(result); 
            System.out.println(" gram"); 

        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}