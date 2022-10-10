package Arrays;
// 2 ms optimized solution
public class MedianofArray {
	 public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 double result = 0;
	        double number1 = 0;
	        double number2 = 0;
	        int mid = ( nums1.length + nums2.length ) / 2;
	        int counter = 0;
	        int i = 0;
	        int j = 0;
	        while(counter <= mid){
	            number1 = number2;
	            if(i<nums1.length && j<nums2.length){
	                if(nums1[i]<nums2[j]){
	                    number2 = nums1[i];
	                    i++;
	                }
	                else{
	                    number2 = nums2[j];
	                    j++;
	                }
	            }
	                else if(i<nums1.length){
	                    number2 = nums1[i];
	                    i++;
	            }
	                else if(j<nums2.length){
	                    number2 = nums2[j];
	                    j++;
	            }
	            counter++;
	        }
	            
	        if(( nums1.length + nums2.length ) % 2 == 0){
	            result = (number1 + number2)/2;
	        }
	        else{
	            result = number2;
	        }
	        return result;
	    }
	public static void main(String[] args) {
		int[] num1= {1,4};
		int[] num2= {2,3};
		System.out.println(findMedianSortedArrays(num1,num2));
		
	}
}
