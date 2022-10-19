package problems;

import java.util.Arrays;

public class Rearrange2149 {
	
	public static  int[] rearrangeArray(int[] nums) {
        int size=nums.length;
        int[] less=new int[size/2];
        int[] great=new int[size/2];
        int lessval=0,greatval=0,ind=0;
        int[] res=new int[size];
        for(int i=0;i<size;i++)
        {
            if(nums[i]>0)
                great[greatval++]=nums[i];
            else
                less[lessval++]=nums[i];
        }
        for(int s=0;s<size/2;s++)
        {
            res[ind++]=great[s];
            res[ind++]=less[s];
        }
        return res; 
    }
  /* optimized way
  for(int i=0;i<size;i++)
        {
            if(nums[i]>0){
                res[greatval]=nums[i];
                greatval+=2;
            }
            else{
                 res[lessval]=nums[i];
                lessval+=2;
            }
        }
        return res;
  */
	public static void main(String[] args) {
		int[] arr= {3,-1,2,-5,};
		System.out.println(Arrays.toString(rearrangeArray(arr)));
	}

}
