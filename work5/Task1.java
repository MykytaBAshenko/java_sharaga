import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task1 {
    public static void work(){

        int a = (int) (Math.random() * 10);

        int[] arr = new int[a];
        int[] arr2 = new int[a];
        for(int y  = 0; y < a; y++) {
            arr[y] = (int) (Math.random() * 10);
            arr2[y] = (int) (Math.random() * 10);
        }
        int [] final_arr = new int[a];
        for(int y  = 0; y < a; y++) {
            final_arr[y] = arr[y] + arr2[y];
        }
        System.out.println("Final random array");
        for(int y  = 0; y < a; y++) {
            System.out.println(y + " - "+final_arr[y]);
        }
        
    }

    public static void main(String[] args) {
        work();
    }
}