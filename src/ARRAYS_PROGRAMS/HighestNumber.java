package ARRAYS_PROGRAMS;

import java.util.Arrays;

public class HighestNumber {

	public static void main(String[] args)
	{
		int ar[]= {5,4,3,2,1,6,9,8,7};
		Arrays.sort(ar);
		for(Integer i:ar)
		{
			System.out.println(i);
		}
		
		System.out.println("1st Highest_element is"+" "+ar[ar.length-1]);
		System.out.println("2nd Highest_element is"+" "+ar[ar.length-2]);
		

	}

}
