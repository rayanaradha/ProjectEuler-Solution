//problem description :https://www.hackerrank.com/contests/projecteuler/challenges/euler013/problem

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
      Scanner x = new Scanner (System.in);
        int t =x.nextInt();
        String r="";
        BigInteger sum= new BigInteger("0");
        for(int i=0; i<t ; i++){
            BigInteger p =x.nextBigInteger();
            sum= sum.add(p);
        }
        r= r+sum;
        System.out.println(r.substring(0,10));      
    }
}
