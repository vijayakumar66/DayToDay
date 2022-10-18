class Solution {
    public static int maxSubArray(int[] nums) {
        int currentSum=0,maxSum=Integer.MIN_VALUE;
      //using kadanes algorithm 
      for(int i=0;i<nums.length;i++)
        {
            currentSum+=nums[i];
            if(maxSum<currentSum) 
                maxSum=currentSum;

            if(currentSum<0) 
                currentSum=0;
        }
        return maxSum;
    }
  pulblic static void main(String[] args)
  {
    int[] arr={-2,2,-1,3,4,-2,1,5};
    System.out.print(Arrays.toString(maxSubArray(arr)));
  }
}
