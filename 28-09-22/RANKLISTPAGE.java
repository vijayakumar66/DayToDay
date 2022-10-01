
import java.util.*;
import java.lang.*;
import java.io.*;
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	        Scanner s=new Scanner(System.in);
	        int input,res,val;
	        input=s.nextInt();
	        while(input>0)
	        {
	            val=s.nextInt();
	            if(val%25==0){
	                System.out.println(val/25);
	                
	            }
	            else{
	                 System.out.println((val/25)+1);
	            }
	              input--;  
	        }
	}
}
