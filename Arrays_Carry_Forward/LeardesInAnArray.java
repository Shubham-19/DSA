/*
 * Problem Description:
 * Given an integer array A containing N distinct integers, you have to find all the leaders in array A. An element is a leader if it is strictly greater than all the elements to its right side.

NOTE: The rightmost element is always a leader.

Problem Constraints

1 <= N <= 105
1 <= A[i] <= 108
Input Format

There is a single input argument which a integer array A
Output Format

Return an integer array denoting all the **leader elements** of the array.
NOTE: Ordering in the output doesn't matter.

Example Input

 A = [16, 17, 4, 3, 5, 2]
Example Output

 [17, 2, 5]

 */

 package Arrays;

import java.util.ArrayList;

/**
  * LeardesInAnArray
  */
 public class LeardesInAnArray {
 
    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> solve(ArrayList<Integer> arr) {
        ArrayList<Integer> leaderArray = new ArrayList<Integer>();
        Integer lastMax = arr.get(arr.size() - 1);
        leaderArray.add(lastMax);
        for (int index = arr.size() - 1; index >= 0; index--) {
            if(arr.get(index) > lastMax){
                lastMax = arr.get(index);
                leaderArray.add(lastMax);
            }
        }
        return leaderArray;
    }
 }