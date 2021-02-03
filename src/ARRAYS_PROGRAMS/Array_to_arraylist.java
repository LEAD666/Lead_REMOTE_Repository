package ARRAYS_PROGRAMS;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_to_arraylist {

	public static void main(String[] args)
	{
		 String []arr = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
		 ArrayList<String>list = new ArrayList<String>(Arrays.asList(arr));
		  
		  System.out.println(list);
	}

}
