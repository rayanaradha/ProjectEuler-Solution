//problem description :https://www.hackerrank.com/contests/projecteuler/challenges/euler002/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    int sum=0;
    int ar[] ={1,1 , 2 , 6 , 24 , 120 , 720 , 5040 , 40320 , 362880};
    int num = x.nextInt();
        for(int i=19; i<num+1 ;i++){
            if(i%10==0){
                continue;
            }
        int ans=0;
        int value=i;
            while (value > 0)  {
                int digit =value % 10;
                 ans+=ar[digit];
                value = value / 10;
            }
            if(ans%i==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

