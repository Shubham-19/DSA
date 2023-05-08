package Arrays_Sub_Arrays;

import java.util.ArrayList;

public class GenerateAllSubArrays {
    public static void main(String[] args) {
        
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result2DArray = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < A.size(); i++) {
            ArrayList<Integer> subArray = new ArrayList<Integer>();
            for (int j = i; j < A.size(); j++) {
                subArray.add(A.get(j));
                result2DArray.add(new ArrayList<>(subArray));
            }
        }

        return result2DArray;
    }
}
