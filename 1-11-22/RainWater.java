
public class RainWater {
	public static  int trap(int[] height) {
        int len=height.length;
        int[] left=new int[len];
        int[] right=new int[len];
        left[0]=0;
        right[len-1]=0;
        int maxVal=0,sum=0,minVal=0,count=0;
        for(int i=0;i<len;i++){
            left[i]=maxVal;
            if(height[i]>maxVal) 
                maxVal=height[i];
        }
        maxVal=0;
         for(int i=len-1;i>=0;i--){
            right[i]=maxVal;
            if(height[i]>maxVal) 
                maxVal=height[i];
        }
        //  System.out.print(Arrays.toString(left));
        //  System.out.print(Arrays.toString(right));
        for(int i=0;i<len;i++){
           minVal=Math.min(left[i],right[i]);
           sum=minVal-height[i]; 
           if(sum>0) count+=sum;
        }
        return count;
    }

	public static void main(String[] args) {
		int[] arr= {4,2,0,3,2,5};
		
		System.out.println(trap(arr));
	}

}
