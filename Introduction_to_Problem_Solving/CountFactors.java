public class CountFactors{

    public static void main(String[] args) {
        System.out.println(countFactorsOfNum(49));
    }

    public static int countFactorsOfNum(int N) {
        int countFactors = 0;

        for(int i = 1; i <= Math.sqrt(N); i++)
            if(N % i == 0) countFactors += (i*i == N) ? 1 : 2;

        return countFactors;
    }
}