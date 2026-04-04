import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();
        int N = sc.nextInt();

        if (D < 0 || D > 9 || N <= 1 || N > 1000) {
            System.out.println("Invalid Input");
            return;
        }

        BigInteger base = BigInteger.valueOf(D).multiply(BigInteger.TEN.pow(10));
        BigInteger sum = BigInteger.ZERO;

        for (int i = 1; i <= N; i++) {

            BigInteger num = base.add(BigInteger.valueOf(i));
            sum = sum.add(num);

        }

        System.out.println(sum);
    }
}