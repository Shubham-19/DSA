//Problem Description

/***********
Problem Description

Given an integer array A of size N, find the first repeating element in it.

We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.

If there is no repeating element, return -1.



Problem Constraints
1 <= N <= 105

1 <= A[i] <= 109



Input Format
The first and only argument is an integer array A of size N.



Output Format
Return an integer denoting the first repeating element.



Example Input
Input 1:

 A = [10, 5, 3, 4, 3, 5, 6]
Input 2:

 A = [6, 10, 5, 4, 9, 120]


Example Output
Output 1:

 5
Output 2:

 -1


Example Explanation
Explanation 1:

 5 is the first element that repeats
Explanation 2:

 There is no repeating element, output -1

***********/


package Hashing;
import java.util.*;

/**
 * FirstRepeatingElement
 */
public class FirstRepeatingElement {

    public static void main(String[] args) {
        System.out.println(findFirstRepeatingElement(new ArrayList<Integer>(Arrays.asList(10, 5, 3, 4, 3, 5, 6 ))));
    }

    public static int findFirstRepeatingElement(ArrayList<Integer> A) {
        
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();

        for(int i=0; i < A.size(); i++){
            if(!lhm.containsKey(A.get(i))){
                lhm.put(A.get(i), 1);
            }else{
                lhm.put(A.get(i), lhm.get(A.get(i)) + 1);
            }
        }

        for (Integer key : lhm.keySet()) {
            if(lhm.get(key) > 1)
                return key;
        }

        return -1;
    }
}