public class SquareRootOfANumber {
    
    public static void main(String[] args) {
        System.out.println(sqrt(56));
    }

    public static double sqrt(int N){
        int i = 1, ans = 0;

        while(i*i <= N){
            ans = i;
            i++;
        }

        if(ans*ans == N) return ans;
        return Math.sqrt(N);
    }
}
