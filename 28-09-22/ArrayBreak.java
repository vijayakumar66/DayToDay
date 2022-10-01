

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
		    int even=0;
		    for(int j=0;j<input;j++)
		    {
		       int value=s.nextInt();
		        if(value%2==0)
		            even++;
		    }
		    if(even == input||even == 0)
		    {
		        System.out.println(0);
		    }
		    else{
		           System.out.println(even);
		       }
		        
		}
	}
}
