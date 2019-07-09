import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        int ans=0;
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }

       
        for(int i=0 ;i<17 ;i++){
            int j=0;
            int k=i;
            while(k>-1){
            ans=(grid[19-j][3+k])* (grid[18-j][2+k])* (grid[17-j][1+k])* (grid[16-j][0+k]);
            k--;
            j++;
        
            if(ans>sum){
            sum=ans;
            }
            
            }
        }

               for(int i=0 ;i<17 ;i++){
            int j=0;
            int k=i;
            while(k>-1){
            ans=(grid[0+j][3+k])* (grid[1+j][2+k])* (grid[2+j][1+k])* (grid[3+j][0+k]);
            k--;
            j++;
            
            if(ans>sum){
            sum=ans;
            }
            
            }
        }
        

for(int i=0 ;i<17 ;i++){
            int j=0;
            int k=i;
            while(k>-1){
            ans=(grid[3+k][19-j])* (grid[2+k][18-j])* (grid[1+k][17-j])* (grid[0+k][16-j]);
            k--;
            j++;
         // System.out.println(ans);
            if(ans>sum){
            sum=ans;
            }
            
            }
        }
        
        for(int i=0 ;i<17 ;i++){
            int j=0;
            int k=i;
            while(k>-1){
            ans=(grid[19-j][16-k])* (grid[18-j][17-k])* (grid[17-j][18-k])* (grid[16-j][19-k]);
            k--;
            j++;
        //  System.out.println(ans);
            if(ans>sum){
            sum=ans;
            }
            
            }
        }

for(int j=0; j<20;j++){
        for(int i=0 ;i<17 ;i++){
            ans=(grid[j][0+i])* (grid[j][1+i])* (grid[j][2+i])* (grid[j][3+i]);
           
         // System.out.println(ans);
            if(ans>sum){
            sum=ans;
            }
            
            }
        }

for(int j=0; j<20;j++){
        for(int i=0 ;i<17 ;i++){
            ans=(grid[0+i][j])* (grid[1+i][j])* (grid[2+i][j])* (grid[3+i][j]);
           
         // System.out.println(ans);
            if(ans>sum){
            sum=ans;
            }
            
            }
        }        
        
        System.out.println(sum);
}
}

