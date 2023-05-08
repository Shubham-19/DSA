// Problem Description
/****************
 * 
Given an array A of N integers.

Find the length of the longest subarray in the array which sums to zero.


Problem Constraints
1 <= N <= 105
-109 <= A[i] <= 109


Input Format
Single argument which is an integer array A.


Output Format
Return an integer.


Example Input
Input 1:

 A = [1, -2, 1, 2]
Input 2:

 A = [3, 2, -1]


Example Output
Output 1:

3
Output 2:

0


Example Explanation
Explanation 1:

 [1, -2, 1] is the largest subarray which sums up to 0.
Explanation 2:

 No subarray sums up to 0.
******************/

import java.util.*;
/**
 * LongestSubArraySumZero
 */
public class LongestSubArraySumZero {

    public static void main(String[] args) {
        System.out.println(optimizedApproach(new ArrayList<Integer>(Arrays.asList(-16, 16, 3))));
    }

    public static int bruteForceApproach(ArrayList<Integer> A) {
        int maxLength = 0;

        for (int i = 0; i < A.size(); i++) {
            int sum = 0;
            int count = 0;
            
            for (int j = i; j < A.size(); j++) {
                sum += A.get(j);
                count += 1;

                if(sum == 0 && maxLength < count) maxLength = count;
            }
        }

        return maxLength;
    }

    
    public static int optimizedApproach(ArrayList<Integer> A) {
        Long sum = 0L;
        int maxLen = 0, subLen = 0;
        HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
        hm.put(0L, -1);
        
        for (int i = 0; i < A.size(); i++) {
            sum += A.get(i);
            if(hm.containsKey(sum)){
                subLen = i - hm.get(sum);
            }
            else
                hm.put(sum, i);
            if(subLen > maxLen) maxLen = subLen;
        }

        return maxLen;
    }
}

