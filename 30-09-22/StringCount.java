package program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counts {

		static void count(String str) {
			int count=1;
			HashMap<Character,Integer> map=new HashMap<>();
			
			for(int index=0;index<str.length();index++)
			{
				char c=str.charAt(index);
				if(!map.containsKey(c))
				{
					map.put(c,1);
				}
				else
				{
					//map.get(c);
					map.put(c,map.get(c)+1 );
				}
			}
			System.out.println(map);
			
			
		}

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the String:");
			String str=sc.next();
			count(str);

		}
	}

