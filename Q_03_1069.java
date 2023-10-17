/*
 * Name: Dyutiraditya Patri
 * Reg No: 2241016303
 * PS LINK: https://cses.fi/problemset/task/1069
 */
import java.util.Scanner;

public class Q_03_1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = 1;
        int sum = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            if(s.charAt(i + 1) == ch){
                sum++;
                n = Math.max(n, sum);
            }else{
                sum = 1;
            }
        }
        System.out.println(n);
    }
}
