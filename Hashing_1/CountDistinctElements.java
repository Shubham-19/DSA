//Problem Description
/********************
You are given an array A of N integers. You will have to return number of distinct elements of the array.

Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109


Input Format
First argument A is an array of integers.


Output Format
Return an integer.


Example Input
Input 1:
A = [3, 4, 3, 6, 6]
Input 2:
A = [3, 3, 3, 9, 0, 1, 0]


Example Output
Output 1:
3
Output 2:
4


Example Explanation
For Input 1:
The distinct elements of the array are 3, 4 and 6.
For Input 2:
The distinct elements of the array are 3, 9, 0 and 1.

*********************/


package Hashing_1;

import java.util.*;

/**
 * CountDistinctElements
 */
public class CountDistinctElements {

    public static void main(String[] args) {
        System.out.println(countDistinctElements(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))));
    }

    public static int countDistinctElements(ArrayList<Integer> A) {
        HashSet<Integer> set = new HashSet<Integer>();

        for(Integer a : A){
            set.add(a);
        }

        return set.size();
    }
    
}