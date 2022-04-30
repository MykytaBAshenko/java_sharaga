import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task1 {
    public static void main(String[] args)
        throws IOException
    {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        String input = reader.readLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            result = input.charAt(i) + result;
        }
        try{
            int number = Integer.parseInt(result);
            System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}