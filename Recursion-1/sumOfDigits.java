// Given a number A, we need to find the sum of its digits using recursion.
// Constraints: 1 <= A <= 10^9

public class Solution {
    public int solve(int A) {
        int sum=A%10;
        int remainder=0;

        if(A<10){
            return A;
        }

        return sum+solve(A/10);
    }
}