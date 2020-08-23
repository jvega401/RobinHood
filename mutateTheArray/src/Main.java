import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] mutateTheArray(int [] a, int n){
        int [] b = new int[n];
        for(int i = 0; i <= n - 1; i++){
            if(n == 1)
                b[i] = a[i];
            else if(i == 0)
                b[i] = 0 + a[i] + a[i+1];
            else if(i == n-1)
                b[i] = a[i-1] + a[i] + 0;
            else
                b[i] = a[i-1] + a[i] + a[i+1];
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char selection = 'c';
        do{
            System.out.print("Enter the size of the array: ");
            int n = keyboard.nextInt();
            int [] a = new int[n];
            Random rand = new Random();
            for(int i = 0; i < n; i++){
                a[i] = rand.nextInt(101);
            }
            System.out.println("The original array contains: " + Arrays.toString(a));
            System.out.println(Arrays.toString(mutateTheArray(a, a.length)));
            System.out.print("Press 'c' to run again or any key to quit: ");
            selection = keyboard.next().charAt(0);
        }while(selection == 'c');
    }
}
