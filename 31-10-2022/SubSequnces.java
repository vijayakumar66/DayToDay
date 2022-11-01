import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SubSquence {
	
	public static void main(String[] args) {
		//String s="XYBYAXBY";
		String s="ABAB";
		//String s="ABACDB";
		new SubSquence().numOfSubSquence(s);
	}
	 String comb="";
	 Set<String> res;
	
	public  void numOfSubSquence(String s)
	{
		res=new HashSet<>();
		subSquence(s,0);
		System.out.println(res);
		System.out.println(res.size());
		
	}
	 void subSquence(String str,int index) {
		
		if(comb.length()>1) {
			checkContain(comb,str.substring(index-1));
		}
		for(int i=index;i<str.length();i++)
		{
			comb+=str.charAt(i);
			subSquence(str,i+1);
			comb=comb.substring(0,comb.length()-1);
		}
		
	}
	  void checkContain(String comsub,String sub) {
		 int len=comsub.length();
		 boolean isMatch=true;
		 int index1=-1;
		 for(int i=0;i<len;i++)
		 {
			 sub=sub.substring(index1+1);

			 //System.out.println(comsub.charAt(i));
			 index1=sub.indexOf(comsub.charAt(i));
			 if(index1==-1)
			 {
				 isMatch=false;
				 break;
			 }
		 }
		 if(isMatch)
		 {
			 System.out.println(comsub);
			res.add(comsub); 
			return;
		 }

	}
}
