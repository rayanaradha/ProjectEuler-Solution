//problem description :https://www.hackerrank.com/contests/projecteuler/challenges/euler005/problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long ans(int n){
        boolean x=true;
        long num=n;
        while(x==true){
        for(int i=1;i<=n ;i++){
            if(num%i!=0){
                num++;
                break;
            }
            if(i==n){
             x=false;    
            }
        }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(ans(n));
        }
    }
}
