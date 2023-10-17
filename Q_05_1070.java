/*
 * Name: Dyutiraditya Patri
 * Reg No: 2241016303
 * PS LINK: https://cses.fi/problemset/task/1070
 */
import java.io.*;
public class Q_05_1070 {
    public static void main(String[] args) throws IOException {
        InputStreamReader io = new InputStreamReader (System.in);
        BufferedReader input = new BufferedReader (io);
        int n = Integer.parseInt(input.readLine());
        input.close();
        giveAns(n);
    }
    public static void giveAns(int n){
        if(n == 2 || n == 3){
            System.out.println("NO SOLUTION");
            return;
        }
        if(n == 4){
            System.out.println(2 + " " + 4 + " " + 1 + " " + 3);
        }
        boolean ans = true;
        StringBuilder s = new StringBuilder();
        for(int i = 1; i <= n; i += 2){   
            s.append(i + " ");
            if((i == n || i == n-1) && ans){
                i = 0;
                ans = false;
            }
        }
        System.out.println(s);
    }
}
