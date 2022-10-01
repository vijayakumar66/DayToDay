
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s= new Scanner(System.in);
	
		int loop,input,val=0,res=0;
		loop=s.nextInt();
		for(int i=0;i<loop;i++)
		{
		    input=s.nextInt();
		   	HashMap<Integer,Integer> map=new HashMap<>();
		    for(int j=0;j<input;j++)
		    {
		        val=s.nextInt();
		        map.put(val,map.getOrDefault(val,0)+1);
		    }
		    int max=0;
		    for(int v:map.values())
			{
			        max=Math.max(max,v);
			}
		    System.out.println(input-max);
		}
	
		
	}
}
