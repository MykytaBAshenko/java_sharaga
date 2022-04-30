import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task1 {
    public static char[] work(String str){
        char[] ch = new char[str.length()];
        char[] ch2 = new char[str.length()];

        try{
            for (int i = 0; i < str.length(); i++) {
                ch[i] = str.charAt(i);
            } 
            int index = 0;
            for (int l = 0; l < str.length(); l++){
                boolean gg = true;
                for(int y  = 0; y < str.length(); y++) {
                    if(l != y && ch[l] == ch [y]) {
                        gg = false;
                    }
                }
                if(gg) {
                    ch2[index++] = ch[l];
                }
            } 
            
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        return ch2;
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