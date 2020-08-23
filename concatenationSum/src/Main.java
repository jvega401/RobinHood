/*
Given an array of positive integers a, your task is to calculate the sum of every possible a[i] ∘ a[j], where a[i] ∘ a[j] is the concatenation of the string representations of a[i] and a[j] respectively.

Example

For a = [10, 2], the output should be concatenationsSum(a) = 1344.

a[0] ∘ a[0] = 10 ∘ 10 = 1010,
a[0] ∘ a[1] = 10 ∘ 2 = 102,
a[1] ∘ a[0] = 2 ∘ 10 = 210,
a[1] ∘ a[1] = 2 ∘ 2 = 22.
So the sum is equal to 1010 + 102 + 210 + 22 = 1344.

For a = [8], the output should be concatenationsSum(a) = 88.

There is only one number in a, and a[0] ∘ a[0] = 8 ∘ 8 = 88, so the answer is 88.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

A non-empty array of positive integers.

Guaranteed constraints:
1 ≤ a.length ≤ 105,
1 ≤ a[i] ≤ 106.

[output] integer64

The sum of all a[i] ∘ a[j]s. It's guaranteed that the answer is less than 253.
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;


public class Main {
	public static int concatenationSum(int [] a){
		int sum = 0;
		Stack stack = new Stack<Integer>();
		for(int i = 0; i < a.length; i++){
			stack.push(a[i]);
		}

		return sum;
	}
    public static void main(String[] args) {
	    Scanner keyboard = new Scanner(System.in);
	    Random rand = new Random();
	    char selection = 'c';
	    do{
			int n = rand.nextInt(5) + 1;
			int [] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = rand.nextInt(106) + 1;
			}
			System.out.println("The array is of size: " + n);
			System.out.println("The array holds: " + Arrays.toString(a));
	    	System.out.print("Press 'c' to continue or any other key to quit: ");
	    	selection = keyboard.next().charAt(0);
		}while(selection == 'c');

    }
}
