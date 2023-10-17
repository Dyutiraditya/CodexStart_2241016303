/*
 * Name: Dyutiraditya Patri
 * Reg No: 2241016303
 * PS LINK: https://cses.fi/problemset/task/1068/
 */
import java.util.Scanner;

public class Q_01_1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(n + " ");
        while(n > 1){
            if(n % 2 == 0) {
                n = n / 2;
            }else{
                n = n * 3 + 1;
            }
            System.out.print(n + " ");
        }
    }
}