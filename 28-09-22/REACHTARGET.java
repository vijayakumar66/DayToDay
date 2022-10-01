

import java.util.*;
import java.lang.*;
import java.io.*;

public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int input=s.nextInt();
		int res;
		while(input>0)
		{
		    int firstscore=s.nextInt();
		    int currentscore=s.nextInt();
		    res=firstscore-currentscore;
		    System.out.println(res);
		    input--;
		}
		s.close();
	}
}
