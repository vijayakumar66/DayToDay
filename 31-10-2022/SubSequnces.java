import java.util.Arrays;
import java.util.HashMap;

public class SubSequnces {
	static void subSquence(String s)
	{
		HashMap<String,Integer> map1=new HashMap<>();
		int len=s.length();
		char[] charr=s.toCharArray();
		
		for(int i=0;i<2*len-1;i++)
		{	
			String str="";
			for(int j=0;j<len;j++) {
				if((i & (1<<j))!=0)
				{
					str+=charr[j];	
				}
				if(str!=""&&str.length()!=1&&str.length()<=3)
				   map1.put(str, map1.getOrDefault(str, 0)+1);
			}
		}
		System.out.println(map1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="XYBYAXBY";
		//String s="ABACDB";
		subSquence(s);

	}

}
