
/*This is simple java solution  for  " Multiples of 3 and 5" problem.
You can see problem description in below link

https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long Prime(long num,long num2){
       long total=num/num2;
       long tt=num2*(total*(total+1))/2;
        return tt;    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         long t = in.nextLong();
            for(long i = 0; i < t; i++){
            long n = in.nextLong();
            System.out.println(Prime((n-1),3)+Prime((n-1),5)-Prime((n-1),15));
            }    
    }
}
