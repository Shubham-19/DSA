package Arrays_Introduction;

import java.util.*;

public class ReverseTheArray {
    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> resultArray = new ArrayList<Integer>(A);
        int tempIndex = A.size() - 1;
        for (int i = 0; i < A.size(); i++) {
            int temp = A.get(i);
            resultArray.set(i, A.get(tempIndex));
            resultArray.set(tempIndex, temp);
            tempIndex -= 1;
        }
        return resultArray;
    }
}
