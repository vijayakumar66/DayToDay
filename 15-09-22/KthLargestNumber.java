package Arrays;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthLargestNumber {
	/*public int findKthLargest(int[] nums, int k) {
	        int start = 0, end = nums.length - 1, index = nums.length - k;
	        while (start < end) {
	            int pivot = partion(nums, start, end);
	            if (pivot < index) start = pivot + 1; 
	            else if (pivot > index) end = pivot - 1;
	            else return nums[pivot];
	        }
	    	//System.out.println(Arrays.toString(nums));
	        return nums[start];
	    }
	    
	    private int partion(int[] nums, int start, int end) {
	        int pivot = start, temp;
	        while (start <= end) {
	            while (start <= end && nums[start] <= nums[pivot]) start++;
	            while (start <= end && nums[end] > nums[pivot]) end--;
	            if (start > end) break;
	            temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	        }
	        temp = nums[end];
	        nums[end] = nums[pivot];
	        nums[pivot] = temp;
	        return end;
	    }*/
		 public int findKthLargest(int[] nums, int k) {
		        for(int index=0;index<k;index++)
		        {
		            for(int index2=1;index2<nums.length-index;index2++)
		            {
		                if(nums[index2]<=nums[index2-1])
		                {
		                    int temp=nums[index2-1];
		                    nums[index2-1]=nums[index2];
		                    nums[index2]=temp;
		                }
		            }
		        }
		    
		        return nums[nums.length-k];
		    }
	public static void main(String[] args) {
		
		int k=3;
		int[] nums= {3,2,1,4,6};
		KthLargestNumber ob=new KthLargestNumber();
		System.out.println(ob.findKthLargest(nums,k));
	
		
	}

}
