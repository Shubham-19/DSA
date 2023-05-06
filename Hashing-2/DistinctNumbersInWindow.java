//Problem description
/**************
You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.

Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.

NOTE: if B > N, return an empty array.



Input Format
First argument is an integer array A
Second argument is an integer B.



Output Format
Return an integer array.



Example Input
Input 1:

 A = [1, 2, 1, 3, 4, 3]
 B = 3
Input 2:

 A = [1, 1, 2, 2]
 B = 1


Example Output
Output 1:

 [2, 3, 3, 2]
Output 2:

 [1, 1, 1, 1]


Example Explanation
Explanation 1:

 A=[1, 2, 1, 3, 4, 3] and B = 3
 All windows of size B are
 [1, 2, 1]
 [2, 1, 3]
 [1, 3, 4]
 [3, 4, 3]
 So, we return an array [2, 3, 3, 2].
Explanation 2:

 Window size is 1, so the output array is [1, 1, 1, 1].
***************/

import java.util.*;

public class DistinctNumbersInWindow {
    
    public static void main(String[] args) {
        System.out.println(getDistictCountInEachWindow(new ArrayList<Integer>(Arrays.asList(1, 2, 1, 3, 4, 3)), 3));
    }

    public static ArrayList<Integer> getDistictCountInEachWindow(ArrayList<Integer> A, int B) {
        long N = A.size();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        ArrayList<Integer> listToBeReturned = new ArrayList<Integer>();

        for(int i = 0; i < B; i++){
            if(!hm.containsKey(A.get(i))) hm.put(A.get(i), 1);
            else hm.put(A.get(i), hm.get(A.get(i)) + 1);
        }
        listToBeReturned.add(hm.size());
        
        int s = 1, e = B;
        
        while(e < N){
            hm.put(A.get(s-1), hm.get(A.get(s-1)) - 1);
            
            if(hm.containsKey(A.get(e))) hm.put(A.get(e), hm.get(A.get(e)) + 1);
            else hm.put(A.get(e), 1);

            if(hm.get(A.get(s-1)) == 0) hm.remove(A.get(s-1));

            listToBeReturned.add(hm.size());

            s += 1;
            e += 1;
        }

        return listToBeReturned;
    }
}
