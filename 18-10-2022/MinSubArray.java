package problems;

public class MinSubArray {
	public static int minSubArrayLen(int target, int[] nums) {
		int left=0;
        int right=0,minWindow=0,result=nums.length+1;
        if(nums.length==0) return 0;
        while(nums.length>right)
        {
            minWindow+=nums[right];
            if(minWindow>=target)
            {
                int minlength=right-left+1;
               if(minlength<=result) result=minlength;
                if(left<right){
                   minWindow-=nums[left];
                   minWindow-=nums[right];
                   left++;
                }
                else{
                    right++;
                }
            }
            else
            {
                right++;
            }
        }
        return result==nums.length+1?0:result;
   }

	public static void main(String[] args) {
		int t=7;
		int[] arr= {1,2,3,4};
		System.out.println(minSubArrayLen(t,arr));
	}
}
