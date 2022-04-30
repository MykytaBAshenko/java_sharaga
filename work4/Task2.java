import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task2 {

    public static int bitsInNumber(int n) {
        int res = 0;
        while (n > 0) {
            n >>= 1;
            res++;
        }
        return res;
    }
    public static String work(String str){
        String gg = "";

        try{
            int number = Integer.parseInt(str);
            
            int i = bitsInNumber(number);
            int bit;
            while ( --i >= 0 ){
                bit = (number & (1 << i)) == 0 ? 0 : 1;
                gg += Integer.toString(bit);
            }
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        return gg;
    }

    public static void main(String[] args)
        throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input string"); 
        String str = reader.readLine();
        System.out.println(work(str));
    }
}