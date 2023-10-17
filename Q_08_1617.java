/*
 * Name: Dyutiraditya Patri
 * Reg No: 2241016303
 * PS LINK: https://cses.fi/problemset/task/1617
 */
import java.util.Scanner;

public class Q_08_1617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long count = 1;
        long ans = 1000000007L;
        for (long i = 0; i < n; i++) {
            count = count * 2;
            count = count % ans;
        }
        System.out.println(count);
    }
}
