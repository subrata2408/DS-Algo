// Problem Description
// Given a number A. Return square root of the number if it is perfect square otherwise return -1.

// Problem Constraints
// 1 <= A <= 108

// Input Format
// First argument is an integer A.

// Output Format
// Return an integer which is the square root of A if A is perfect square otherwise return -1.

// Example Input
// Input 1:
// A = 4

// Input 2:
// A = 1001

// Example Output
// Output 1:
// 2

// Output 2:
// -1


// Example Explanation
// Explanation 1:
// sqrt(4) = 2

// Explanation 2:
// 1001 is not a perfect square.
package basicProblems;

public class CalculateSquareRoot {
    public int solve(int A) {
        if (A == 0 || A == 1) {
            return A;
        }

        int min = 0;
        int max = A / 2;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (mid == A / mid) {
                return mid;
            }

            if (mid > A / mid) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }
}
