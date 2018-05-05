import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
	int n=in.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sum=0;
	int minofarray=-9;
	int max=minofarray*7;//7 is the elements in the hourglass
   
        for(int i=0;i<(n-2);i++)
        {
            for(int j=0;j<(n-2);j++)
            {
                int x=i,y=j;
                for(int i1=i;i1<x+3;i1++)
                {
                    for(int j1=j;j1<y+3;j1++)
                    {
                        if(i1==x+1)
                        {
                            sum=sum+arr[i1][j1+1];
		
                            break;
                        }
                        else
                            sum=sum+arr[i1][j1];

                    }
                }
               // System.out.println(sum+" is sum & max is "+max);
                if(sum>max) 
                    max=sum;
               sum=0;   
            }
        }
        System.out.println(max);
    }
}
