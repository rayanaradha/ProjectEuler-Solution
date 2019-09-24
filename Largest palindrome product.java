//problem description :https://www.hackerrank.com/contests/projecteuler/challenges/euler004/problem


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean isTrue(int num){
        int m=num;
        int n=0;
        while(m>0){
            n=(n*10)+(m%10);
            m/=10;
        }
        if(n==num){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static int ans(int num){
        int ans=0;
        for(int i=990 ; i>99; i-=11){
            for(int j=999 ; j>99; j--){
               int total=i*j;
                    if(num>total && ans<total &&isTrue(total)){
                    ans=total;
                    break;
                    }
                    else if(ans>total){
                    break;
                    }            
            }
    }
        return ans;
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
