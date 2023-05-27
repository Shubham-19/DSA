package Arrays_Introduction;

import java.util.ArrayList;

public class ArrayRotation {
    
    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        B = B % A.size();

        //Reversing the entire array
        reverseArray(A, 0, A.size() - 1);

        //Reversing the first B elements
        reverseArray(A, 0, B-1);

        //Reversing the remaining B elements
        reverseArray(A, B, A.size()-1);

        return A;

    }

    public ArrayList<Integer> reverseArray(ArrayList<Integer> A, int B, int C) {
        for (int i = B; i < C; i++) {
            int temp = A.get(i);
            A.set(i, A.get(C));
            A.set(C, temp);
            C -= 1;
        }
        return A;
    }
}
