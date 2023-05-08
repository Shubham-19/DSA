//Problem Description
/************** 
Problem Description
Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.


Problem Constraints
1<= Length of array B <= 103
0<= Bi <=109
0<= A <=109


Input Format
First argument A is the Target sum, and second argument is the array B


Output Format
Return an integer value 1 if there exists such pair, else return 0.


Example Input
Input 1:

A = 8   B = [3, 5, 1, 2, 1, 2]
Input 2:

A = 21   B = [9, 10, 7, 10, 9, 1, 5, 1, 5]


Example Output
Output 1:

1
Output 2:

0


Example Explanation
In Example 1:
It is possible to obtain sum 8 using 3 and 5.
***************/
package Hashing_2;
import java.util.*;

/**
 * CheckPairSum
 */
public class CheckPairSum {

    public static void main(String[] args) {
        System.out.println(checkIfPairOfElementsExists(100, new ArrayList<Integer>(Arrays.asList(23, 52, 95, 29, 9, 47, 49, 55, 96, 4))));
    }

    public static Boolean checkIfPairOfElementsExists(int A, ArrayList<Integer> B) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        
        for (Integer elem : B) {
            System.out.println(elem + ", " + (A - elem) + ", " + hs);
            if(hs.contains(A - elem)) return true;
            else hs.add(elem);
        }

        return false;
    }
}