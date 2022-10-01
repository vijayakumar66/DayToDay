package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class YearCount {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<>();
		int[] come= {1990,1990,1991,1995,1996};
		int[] out= {1991,1994,1993,1997,1997};
		int count=0,year=0,end=0;
		
		for(int i=0;i<come.length;i++)
		{
			year=come[i];
			end=out[i];
			for(int j=year;j<=end;j++)
			{
					if(!map.containsKey(j))
					{
						map.put(j, 1);
					}
					else
					{
						map.put(j, map.get(j)+1);
					}	
			}

		}
		System.out.println(map);
	}

}
