/*
 * Name: Dyutiraditya Patri
 * Reg No: 2241016303
 * PS LINK: https://cses.fi/problemset/task/1071
 */
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;

public class Q_06_1071 {
    public static void main(String[] args) throws IOException{
        InputStreamReader io = new InputStreamReader (System.in);   
        BufferedReader br = new BufferedReader (io);             
        int t = Integer.parseInt(br.readLine());   
        for(int i = 0; i < t; i++){
            String[] s = br.readLine().split(" ");         
            int y  = Integer.parseInt(s[0]);
            int x = Integer.parseInt(s[1]);
            spiral(y, x);   
        }
    }
    public static void spiral(int y,int x){
        long ans = 1;
        long max = (long)Math.max(y, x);
        long value = max * max - max + 1; 
        if(max % 2 == 0){ 
            if(y < (int)max){
                ans = value - (max - y);
            }
            else{
                ans = value+(max-x);
            }
        }else{
            if(y < (int)max){
                ans = value + (max - y);
            }
            else{
                ans = value - (max - x);
            }
        }
        System.out.println(ans);
    }
}