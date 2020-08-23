import java.util.Arrays;

public class Main {

    public static int[] mutateTheArray(int [] a, int n){
        int [] b = new int[n];
        for(int i = 0; i <= n - 1; i++){
            if(i == 0)
                b[i] = 0 + a[i] + a[i+1];
            else if(i == n-1)
                b[i] = a[i-1] + a[i] + 0;
            else
                b[i] = a[i-1] + a[i] + a[i+1];
            System.out.println("The array at " + i + " holds " + b[i]);
        }

        return b;
    }

    public static void main(String[] args) {
	    int [] a = new int[] {1,2,3,4};
	    System.out.println(Arrays.toString(mutateTheArray(a, a.length)));
    }
}
