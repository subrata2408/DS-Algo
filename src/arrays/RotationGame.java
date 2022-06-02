// Problem Description
// Given an integer array **A** and an integer **B**, you have to print the same array after rotating it **B** times towards the right.


// Output Format
// Print an array of integers which is the **Bth** right rotation of input array **A**, on a separate line.


// Example Input
// Input 1:


// Example Output
// Output 1:


// Example Explanation
// Explanation 1:
//  [1,2,3,4] => [4,1,2,3] => [3,4,1,2]

package arrays;

import java.lang.*;
import java.util.*;

public class RotationGame {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int r = input.nextInt() % n;

        if (r > 0) {
            reverse(arr, 0, n - 1);
            reverse(arr, 0, r - 1);
            reverse(arr, r, n - 1);
        }
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
