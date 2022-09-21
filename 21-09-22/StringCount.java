import java.util.Scanner;

public class StringCount {
	static void printStirngCount(String input)
	{
		int length=input.length();
		int left,right,mid=length/2,count=1;
		if(length<2)
			System.out.println("Enter the number greater than 3");
		if(length%2!=0)
		{
			left=0;right=mid;count=mid;
			while(left<mid){
					for(int index=0;index<=count;index++)
					{
						System.out.print(input.charAt(left));
					}
					count--;
					left++;
			}
			count=1;
			while(right<length) {
				for(int index1=0;index1<count;index1++)
				{
					System.out.print(input.charAt(right));
					
				}
				count++;
				right++;
				
		
			}
		}
	}
	public static void main(String[] args) {
		String input;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input String: ");
		input=sc.next();
		printStirngCount(input);
	}

}
