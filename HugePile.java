// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//
import java.util.*;
class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        
        int arr[][]=new int[r][c];
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        int dp[][]=new int[r][c];
        
        int max_1=-1;
        int max_2=-1;
        
        for(int i=0;i<r;i++)
        {
            int new_1=-1;
            int new_2=-1;
            for(int j=0;j<c;j++)
            {
                if(i==0)
                {
                    dp[i][j]=arr[i][j];
                }
                else
                {
                    if(dp[i-1][j]==max_1)
                    {
                        dp[i][j]=max_2+arr[i][j];
                    }
                    else
                    {
                        dp[i][j]=max_1+arr[i][j];
                    }
                }
                new_1=Math.max(dp[i][j],new_1);
                if(new_1>dp[i][j] && new_2<dp[i][j])
                {
                    new_2=dp[i][j];
                }
            }
            max_1=new_1;
            max_2=new_2;
          
        }
          System.out.println(max_1);
        // int max=-1;
        // for(int i:dp[r-1])
        // {
        //     max=Math.max(i,max);
        // }
        // System.out.println(max_1);
    }
}
