/*
 * Name: Dyutiraditya Patri
 * Reg No: 2241016303
 * PS LINK: https://cses.fi/problemset/task/1072
 */
import java.util.Scanner;

public class Q_07_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(0);
        for (long i = 2; i <= n ; i++) {
            System.out.println((long)((i * i) * (i * i - 1) / 2 - (4 * (i - 2) * (i - 1))));
        }
    }
}
