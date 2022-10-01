

import java.util.*;
import java.lang.*;
import java.io.*;


public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int loop=s.nextInt();
		for(int i=0;i<loop;i++)
		{
		    int input=s.nextInt();
		    int[] A=new int[input];
		    int[] B=new int[input];
		    for(int j=0;j<input;j++)
		    {
		       A[j]=s.nextInt();
		       B[j]=s.nextInt();
		       if(j!=0)
		       {
		
		           double a1=A[j-1];
		           double b1=B[j-1];
		           double a=A[j],b=B[j];
		           double pa=Math.pow(a,a1);
		           double pb=Math.pow(b,b1);
		           if(pa==a&&pb==b)
		           {
		               System.out.println("YES");
		           }
		           else
		                System.out.println("NO");
		                
		       }
		       else
		       {
		           		System.out.println("NO");
		       }
		    }
		}
	}
}
