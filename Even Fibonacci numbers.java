//problem description :https://www.hackerrank.com/contests/projecteuler/challenges/euler002/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long ans(long n){
        long res=0;
        long num1=1;
        long num2=1;
        while(num2<n){
           if(num2%2==0){
               res+=num2;
           }
           long num3=num1+num2;
           num1=num2;
           num2=num3;           
        }
         return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(ans(n));
        }
    }
}
