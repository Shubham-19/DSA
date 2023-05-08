/*
 * Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

and at least one occurrence of the minimum value of the array.



Problem Constraints
1 <= |A| <= 2000



Input Format
First and only argument is vector A



Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array



Example Input
Input 1:

A = [1, 3, 2]
Input 2:

A = [2, 6, 1, 6, 9]


Example Output
Output 1:

 2
Output 2:

 3


Example Explanation
Explanation 1:

 Take the 1st and 2nd elements as they are the minimum and maximum elements respectievly.
Explanation 2:

 Take the last 3 elements of the array.
 */

package Arrays;

import java.util.ArrayList;

public class ClosestMinMax {
    
    public static void main(String[] args) {
        
    }

    public int solve(ArrayList<Integer> A) {
        //find min. and max. of Array
        int minA = A.get(0);
        int maxA = minA;
        int ans = A.size();
        for (int elem : A) {
            if(elem < minA) minA = elem;
            else if(elem > maxA) maxA = elem;
        }

        int lastMinIndex = -1;
        int lastMaxIndex = -1;

        for (int i = 0; i < A.size(); i++) {
            if(A.get(i) == minA){
                lastMinIndex = i;
                if(lastMaxIndex != -1) ans = Math.min(ans, i - lastMaxIndex + 1);
            }

            if(A.get(i) == maxA){
                lastMaxIndex = i;
                if(lastMinIndex != -1) ans = Math.min(ans, i - lastMinIndex + 1);
            }
        }
        return ans;
    }
}
