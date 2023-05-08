/*
 * Problem Description
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Note :
1. Try to figure out the contribution of A[i] in the sum of all subarray sums.
2. In another word, for A[i], try to find count of A[i] in entire subarray sums.



Problem Constraints
1 <= N <= 105
1 <= Ai <= 10 4


Input Format
The first argument is the integer array A.


Output Format
Return a single integer denoting the sum of all subarray sums of the given array.


Example Input
Input 1:
A = [1, 2, 3]
Input 2:

A = [2, 1, 3]


Example Output
Output 1:
20
Output 2:

19


Example Explanation
Explanation 1:
The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
Explanation 2:

The different subarrays for the given array are: [2], [1], [3], [2, 1], [1, 3], [2, 1, 3].
Their sums are: 2 + 1 + 3 + 3 + 4 + 6 = 19
 */

package Arrays_Sub_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfAllSubArrays {
    public static void main(String[] args) {
        System.out.println(subarraySum(new ArrayList<Integer>(Arrays.asList(2, 9, 5))));
    }

    public static Long subarraySum(ArrayList<Integer> A) {
        Long sum = Long.valueOf(0);

        for (int i = 0; i < A.size(); i++) {
            sum += Long.valueOf(A.get(i)) * (i + 1) * (A.size() - i);
        }
        
        return sum;
    }
}
