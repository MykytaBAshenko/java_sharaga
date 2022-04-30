import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Task2 {
    public static void work(){

        int a = (int) (Math.random() * 20);

        int[] arr = new int[a];
        for(int y  = 0; y < a; y++) {
            int i = 1;
            if(0.5<=Math.random()){
                i = -1;
            }
            arr[y] = i * (int) (Math.random() * 10);
        }
        int counter_for_minus = 0;
        int counter_for_plus = 0;

        for(int p = 0; p < a; p++) {
            if (arr[p] < 0) {
                counter_for_minus++;
            } else {
                counter_for_plus++;
            }
        }
        int []arr_plus = new int [counter_for_plus];
        int []arr_minus = new int [counter_for_minus];
        int minus_counter = 0;
        int plus_counter = 0;

        for(int p = 0; p < a; p++) {
            if (arr[p] < 0) {
                arr_minus[minus_counter++] = arr[p];
            } else {
                arr_plus[plus_counter++] = arr[p];
            }
        }
        System.out.println("Array with all items");
        for(int y  = 0; y < a; y++) {
            System.out.println(y + " = "+arr[y]);
        }
        
        System.out.println("Array with minus items");
        for(int y  = 0; y < minus_counter; y++) {
            System.out.println(y + " = " + arr_minus[y]);
        }

        System.out.println("Array with plus items");
        for(int y  = 0; y < plus_counter; y++) {
            System.out.println(y + " = " + arr_plus[y]);
        }
    }

    public static void main(String[] args) {
        work();
    }
}