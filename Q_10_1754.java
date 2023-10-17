/*
 * Name: Dyutiraditya Patri
 * Reg No: 2241016303
 * PS LINK: https://cses.fi/problemset/task/1754
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10_1754 {
    public static void main(String[] args) throws IOException {
        InputStreamReader io = new InputStreamReader (System.in);   
        BufferedReader br = new BufferedReader (io);             
        int t = Integer.parseInt(br.readLine());   
        for(int i = 0; i < t; i++){
            String[] s = br.readLine().split(" ");         
            int left  = Integer.parseInt(s[0]);
            int right = Integer.parseInt(s[1]);
            coin(left, right);
        }    
        br.close();
    }
    public static void coin(int left, int right){
        if(Math.abs(left - right) > (int)Math.min(left, right) || (left + right) % 3 != 0){
            System.out.println("NO");
            return;
        } 
        System.out.println("YES");
    }
}
