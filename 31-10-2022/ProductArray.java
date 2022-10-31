import java.util.ArrayList;
import java.util.Arrays;

public class ProductArray {
	static void productArray(int[] arr)
	{
		int[] res=new int[arr.length];
		int sum=1,count=0;
		
		for(int i=0;i<arr.length;i++)
		{	
			for(int j=0;j<arr.length;j++)
			{	
				if(i!=j) {
					sum=sum*arr[j];
//					count=arr[j]<<1;
//					sum+=count;
				}
			}
			res[i]=sum;
			sum=1;
		}
		System.out.println(Arrays.toString(res));
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		productArray(arr);

	}

}
