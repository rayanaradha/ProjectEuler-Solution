
//problem description :https://www.hackerrank.com/contests/projecteuler/challenges/euler008/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void ans (String num,int k){
   long an=0;
       
        for(int i=0; i<=num.length()-(k);i++){
            long total=1; 
            String r=num.substring(i,i+k);
            for(int j=0 ; j<r.length();j++){   
            total*=Integer.parseInt(""+r.charAt(j));
            }
            if(an<total){
                an=total;
            }
    }
        System.out.println(an);
    }

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            String num= in.next();
            ans(num,k);
        }
    }
}
