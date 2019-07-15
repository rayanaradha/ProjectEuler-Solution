
/*This is java solution  for  " Laragst Prime Factor" problem.
You can see problem description in below link

https://www.hackerrank.com/contests/projecteuler/challenges/euler001/problem*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static long maxPrimeFactors( long n) 
{ 
      long ans=0;
      while(n%2==0){
        n=n/2; 
        ans=2;  
      }
        
      for(int i=3 ; i <= Math.sqrt(n) ; i+=2){
          while(n%i==0){
            n=n/i;
            ans=i;  
          }
      }
        if(n>2){
      return n;
        }
        else {
            return ans;
        }
} 
  

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(maxPrimeFactors(n));
        }
    }
}
