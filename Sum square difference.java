//problem description :https://www.hackerrank.com/contests/projecteuler/challenges/euler006/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void ans(int n){
       long a=  (long)(Math.pow((n*(n+1)/2),2));
       long b1= (long)((n)*(n+1));
       long b2= (long)((2*n)+1);
       long b3=b1*b2;
       long b= (long)(b3/6);
       long c=a-b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            ans(n);
        }
    }
}
