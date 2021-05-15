package aufgaben.aufgabe4;

import java.util.*;

public class SingleNumber {
	
	public static int singleNumber(int[] nums)
	{
		final int NOT_FOUND = -1;
		Set<Integer> unique = new HashSet<>();
		for(int i:nums)
		{
			if(!unique.add(i))
			{
				unique.remove(i);
			}
		}
		
		if(unique.size()==0)
		{ 
			System.out.println("The Array is empty.");
			return NOT_FOUND;
		}
		
		if(unique.size()>1)
		{ 
			System.out.println("The array contains more than one single number!");
			return NOT_FOUND;
		}
		
		return unique.iterator().next();
	}
	
	public static void main(String[] args) 
	{
		int[] nums = {2,2,6,9,0,7,6,9,0};
		int[] nums1 = {};
		int[] nums2 = {2,2,6,9,0,7,6,9};
		
		System.out.println(singleNumber(nums));
		System.out.println(singleNumber(nums1));
		System.out.println(singleNumber(nums2));
	} 

	

}
