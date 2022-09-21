/*
 * Name:Jumping Clouds
 * Question link:https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_r=next-challenge&h_v=zen
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JumpingClouds {
	public static int jumpOnClouds(List<Integer> list)
	{
		int result=0;
		int start=0;
		while(start != list.size()-1)
		{			
					if(start+2 <= list.size()-1&&list.get(start+2)==0) {
						
						start+=2;
					}else {
						
						start+=1;
					}
						
					result++;
					
		}
		return result;
	}
	public static void main(String[] args) {
		Integer[] arr= {0,1,0,1,0,1,0};
		List<Integer>arr1=Arrays.asList(arr);
		System.out.println(jumpOnClouds(arr1));
	}

}
