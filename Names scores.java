//problem description :https://www.hackerrank.com/contests/projecteuler/challenges/euler022/problem

import java.io.*;
import java.util.*;

public class Solution {

   public static int compare(String ar[],String word){
        boolean x=false;
        int i=0;
        while(!x){
            x=word.equals(ar[i]);
            i++;
        }
        return i;
    }
    
    public static void value(String arr[],String ar[]){
        for(int i=0; i<arr.length; i++){
            int total=0;
          int dd= compare(ar,arr[i]);
          
            for(int j=0 ; j<arr[i].length() ;j++){
            
                total+=(int)((arr[i].charAt(j))-('A')+1);
                
            }
            System.out.println(total*dd);
        }    
    } 
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int t = x.nextInt();
        String ar[]=new String[t];
        for(int i=0 ; i<t ;i++){
            ar[i]=x.next();
        }
        int t_1 = x.nextInt();
        String arr[]=new String[t_1];
        for(int i=0 ; i<t_1 ;i++){
            arr[i]=x.next();
        }
        Arrays.sort(ar);
        value(arr,ar);
        
    }
}
