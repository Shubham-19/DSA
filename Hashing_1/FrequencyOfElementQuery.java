//Problem Description
/******************

Problem Description
Given an array A. You have some integers given in the array B.

For the i-th number, find the frequency of B[i] in the array A and return a list containing all the frequencies.

Problem Constraints
1 <= |A| <= 105
1 <= |B| <= 105
1 <= A[i] <= 105
1 <= B[i] <= 105

Input Format
First argument A is an array of integers.

Second argument B is an array of integers denoting the queries.

Output Format
Return an array of integers containing frequency of the each element in B.

Example Input
Input 1:
A = [1, 2, 1, 1]
B = [1, 2]
Input 2:
A = [2, 5, 9, 2, 8]
B = [3, 2]

Example Output
Output 1:
[3, 1]
Output 2:
[0, 2]

Example Explanation
For Input 1:
The frequency of 1 in the array A is 3.
The frequency of 2 in the array A is 1.
For Input 2:
The frequency of 3 in the array A is 0.
The frequency of 2 in the array A is 2.

*******************/

//Code

package Hashing;
import java.util.*;

/**
 * FrequencyOfElementQuery
 */
public class FrequencyOfElementQuery {

    public static void main(String[] args) {
        System.out.println(countFrequency(new ArrayList<Integer>(Arrays.asList(6, 3, 3, 6, 7, 8, 7, 3, 7)), new ArrayList<Integer>(Arrays.asList(10, 9, 8))));
    }

    public static ArrayList<Integer> countFrequency(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        ArrayList<Integer> listToReturn = new ArrayList<Integer>();

        for(int i=0; i < A.size(); i++){
            if(!hm.containsKey(A.get(i))){
                hm.put(A.get(i), 1);
            }else{
                hm.put(A.get(i), hm.get(A.get(i)) + 1);
            }
        }

        for(int i=0; i < B.size(); i++){
            if(hm.containsKey(B.get(i)))
                listToReturn.add(hm.get(B.get(i)));
            else
            listToReturn.add(0);
        }

        return listToReturn;
    }
}