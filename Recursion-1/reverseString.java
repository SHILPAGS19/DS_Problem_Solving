// Problem Description

// Write a recursive function that, given a string S, prints the characters of S in reverse order.


// Problem Constraints

// 1 <= |s| <= 1000


import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length();
        printReverseString(S,(n-1));
        
    }
    
    static void printReverseString(String S, int pos){
        if(pos<0){
            return;
        }
         System.out.print(S.charAt(pos));
         printReverseString(S, pos-1);
    }
}