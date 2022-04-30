import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task1 {
    public static void main(String[] args)
        throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("select tringal"); 
        String tringal = reader.readLine();
        System.out.println("count of *"); 
        String count = reader.readLine();
        

        try{
            int tringalnumber = Integer.parseInt(tringal);
            int countnumber = Integer.parseInt(count);
            if(countnumber < 3 || tringalnumber < 1 || tringalnumber > 5) {
                System.err.println("Error in input");
                return;
            }
            StringBuilder result = new StringBuilder();
            if(tringalnumber == 1) {
                for(int i = 1; i <= countnumber; i++){
                    for(int l = 1; l <= i; l++){
                        System.out.print("*");
                    }
                    System.out.println("");
                    
                }
                for(int i = countnumber-1; i >= 1; i--){
                    for(int l = i; l >= 1; l--){
                        System.out.print("*");
                    }
                    System.out.println("");
                    
                }
            }
             if(tringalnumber == 2) {
                for(int i = 1; i <= countnumber; i++){
                    for(int l = 2; l <= i; l++){
                        System.out.print(" ");
                    }
                    for(int l = 0; l <= countnumber-i; l++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
            if(tringalnumber == 3) {
                for(int i = 1; i <= countnumber; i++){
                    for(int l = 1; l <= countnumber-i; l++){
                        System.out.print(" ");
                    }
                    for(int l = 1; l <= i; l++){
                        System.out.print("*");
                    }
                    
                    System.out.println("");
                }
            }
             if(tringalnumber == 4) {
                for(int i = 1; i <= countnumber; i++){
                    for(int l = 1; l <= countnumber-i; l++){
                        System.out.print(" ");
                    }
                    for(int l = 1; l <= i; l++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for(int i = 1; i <= countnumber; i++){
                    for(int l = 1; l <= i; l++){
                        System.out.print(" ");
                    }
                    for(int l = 1; l <= countnumber - i; l++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
              if(tringalnumber == 5) {
                for(int i = 1; i <= countnumber; i++){
                    for(int l = 1; l <= countnumber-i; l++){
                        System.out.print(" ");
                    }
                    for(int l = 1; l <= i; l++){
                        System.out.print("*");
                    }
                    for(int l = 2; l <= i; l++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                 for(int i = 1; i <= countnumber; i++){
                    for(int l = 1; l <= countnumber-i; l++){
                        System.out.print(" ");
                    }
                    for(int l = 1; l <= i; l++){
                        System.out.print("*");
                    }
                    for(int l = 2; l <= i; l++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
    }
}