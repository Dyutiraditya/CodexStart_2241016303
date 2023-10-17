/*
 * Name: Dyutiraditya Patri
 * Reg No: 2241016303
 * PS LINK: https://cses.fi/problemset/task/1618
 */
import java.util.Scanner;

public class Q_09_1618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long element = 5;
        long count = 0;
        while(element <= n){
            count = count + n / element;
            element = element * 5;
        }
        System.out.println(count);
    }
}
