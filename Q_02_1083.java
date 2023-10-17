/*
 * Name: Dyutiraditya Patri
 * Reg No: 2241016303
 * PS LINK: https://cses.fi/problemset/task/1083
 */
import java.util.Scanner;

public class Q_02_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] arr = new long[(int) (n - 1)];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        long sum1 = n * (n + 1) / 2;
        long sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        System.out.println(sum1 - sum2);
    }
}
