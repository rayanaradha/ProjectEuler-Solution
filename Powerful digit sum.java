
//problem description :https://www.hackerrank.com/contests/projecteuler/challenges/euler056/problem

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        String total= " ";
        
        int sum=0;
        Scanner x= new Scanner(System.in);
        
        int y= x.nextInt();
        
     for(int k=0 ; k<y ;k++){
        for(int i=0 ; i<y ;i++){
            BigInteger num=BigInteger.valueOf(k);
            BigInteger ans=num.pow(i);

            total= ans.toString();
             int anss = 0;
            for(int j=0 ; j<total.length() ; j++){
                 anss+=Integer.parseInt(""+total.charAt(j));
            }

           if(anss>sum){
            sum=anss;
           }
     }  }
       System.out.println(sum);
    
}
}
