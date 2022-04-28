// Problem Description

// Write a program to find the factorial of the given number A.


// Problem Constraints

// 0 <= A <= 12

public class Solution {
    public int solve(int A) {
        if(A==0){
            return 1;
        }
        return A*solve(A-1);
    }
}