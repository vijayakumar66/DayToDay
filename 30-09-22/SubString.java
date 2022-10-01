package program;

import java.util.ArrayList;
import java.util.Scanner;

public class SubString {
	static void subcount(String str,String pattern)
	{
		char[] pat=pattern.toCharArray();
		ArrayList<String> list=new ArrayList<>();
		String substring=null;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				char c=str.charAt(i);
				if(c==str.charAt(j)) {
					substring=(String) str.subSequence(i,j);
					list.add(substring);
					i=j-1;
					break;
				}
			}
			
		}
	
		System.out.println(list);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str,pattern;
		System.out.println("Enter the String:");
		str=s.next();
		System.out.println("Enter the Pattern:");
		pattern=s.next();
		subcount(str,pattern);
	}

}
