package ARRAYS_PROGRAMS;

import java.util.Arrays;

public class Array_First_Program
{

	public static void main(String[] args) 
	{
		//sort int array n String array
		
		int arr[]= {5,4,1,2,6,3};
		String newarr[]= {"c","perl","python","java","c++"};
		
		Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(newarr);
    	System.out.println("sorted arrays is"+Arrays.toString(newarr));
		
				
	}
}


