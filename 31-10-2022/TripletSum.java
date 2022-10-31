import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class TripletSum {
	static void findTriplet(int[] arr)
	{
		Arrays.sort(arr);
		ArrayList<Integer> list=new ArrayList<>();
		Set<List<Integer>> set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++){
				
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						list.add(arr[i]);	
						list.add(arr[j]);
						list.add(arr[k]);
						set.add(list);
					}
					
				}
				list=new ArrayList<>();
			}
		}
		System.out.println(set);
	}
	public static void main(String[] args) {
		int[] arr= {-1,0,1,2,-1,4};
		findTriplet(arr);
	}
}
