/*
 * Problem Description
Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109
0 <= B <= C <= N - 1

 */

package Arrays_Introduction;

import java.util.ArrayList;

public class ReverseInAGivenRange {
    
    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> reverseArray(ArrayList<Integer> A, int B, int C) {
        for (int i = B; i < C; i++) {
            int temp = A.get(i);
            A.set(i, A.get(C));
            A.set(C, temp);
            C -= 1;
        }
        return A;
    }
}
