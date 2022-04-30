import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task3 {
    public static void main(String[] args)
        throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("deposit amount"); 
        String deposit = reader.readLine();
        System.out.println("number of months"); 
        String months = reader.readLine();
        System.out.println("annual %"); 
        String procent = reader.readLine();

        try{
            double dep = Double.parseDouble(deposit);
            double proc = Double.parseDouble(procent);
            int mon = Integer.parseInt(months);
            proc /= 100;
            double in_mounth = dep * proc/ 12;
            double result = in_mounth * mon;
            double final_res = result + dep;
        System.out.println("After " + months + " months you will have " + final_res); 



        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}