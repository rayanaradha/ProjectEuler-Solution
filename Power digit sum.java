//problem description :https://www.hackerrank.com/contests/projecteuler/challenges/euler016/problem

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        int sum=0;
        Scanner x = new Scanner(System.in);
        int t=x.nextInt();
        for(int i=0 ; i<t ; i++){
            sum=0;
            int an=x.nextInt();
            BigInteger r =BigInteger.valueOf(2).pow(an);
            String xx=r.toString();
            for(int j=0 ; j<xx.length() ; j++){
               sum+=Integer.parseInt(""+xx.charAt(j));
               
            }
            System.out.println(sum);
        }
        
    }
}
