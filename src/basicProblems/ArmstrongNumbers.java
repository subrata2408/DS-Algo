// Armstrong Numbers!
// Problem Description

// You are given an integer N you need to print all the Armstrong Numbers between 1 to N.
// If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
// For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).

// Problem Constraints
// 1 <= N <= 500

// Input Format
// First and only line of input contains an integer N.


// Output Format
// Output all the Armstrong numbers in range [1,N] each in a new line.

// Example Input
// Input 1:
//  5

// Input 2:
//  200


// Example Output
// Output 1:
// 1

// Output 2:
// 1
// 153


// Example Explanation
// Explanation 1:
// 1 is an armstrong number.

// Explanation 2:
// 1 and 153 are armstrong number under 200.

package basicProblems;

import java.lang.*;
import java.util.*;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            int val = i;
            int sum = 0;
            while (val > 0) {
                int rem = val % 10;
                sum += (rem * rem * rem);
                val = val / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }

    }
}
