package boatproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountBoat {
	static void getInput(List<Integer> list, int maxWeight) {
			int boatCount=0;
			Collections.sort(list);
			int left=0,right=list.size()-1;
			int first=list.get(left)+list.get(left+1);
			 if(first>limit)
			 {
				return list.size();
			  }
			while(left<right)
			{ 
				int sum=list.get(left)+list.get(right);
				
				if(maxWeight==list.get(right))
				{
					right--;
					boatCount+=1;
				}
				else if(sum==maxWeight)
				{
					left++;
					right--;
					boatCount+=1;
				} 
				for(++left;left<right;left++)	{
					sum+=list.get(left);
					if(maxWeight==sum)
					{
						right--;
						boatCount+=1;
						break;
					}else  if(maxWeight<sum){
						left--;
						right--;
						boatCount+=1;
						break;
						
					}
				}
			}
			System.out.println(boatCount);
		}

	public static void main(String[] args) {
		int n,maxWeight,pWeight;
		List<Integer> list=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Maximum Weight");
		maxWeight=sc.nextInt();
		System.out.println("Enter the  Number of Passangers:");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			pWeight=sc.nextInt();
			if(pWeight<=maxWeight)
			{
				list.add(pWeight);
			}else {
				System.out.println("You not eligble");
			}
		}
		getInput(list,maxWeight);
		sc.close();
	}

	 
}
