/*
    *problem statement: count the number of elements which is greater than atleast one element in the array
    *observations: the max element doesn't not have element greater than itself, all other will
    *approach: count no.of max elements max, ans=N-max;
    TC= O(N)
 */

import java.util.*;


public class Main {
    static int countGreaterElements(int A[]){
        int max = findMax(A);
        int maxCount = 0;
        int finalResult = 0;
        for(int i=0;i<A.length;i++) {
            if(A[i]==max){
                maxCount++;
            }
        }
        finalResult = A.length - maxCount;
        return finalResult;
    }
    static int findMax(int[] A) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]>max) {
                max=A[i];
            }
        }
        return max;
    }
    public static void main(String args[]) {
        int[] input ={3,2,1,4,5,5}; 
        int output = countGreaterElements(input);
        System.out.print(output);
    }
}