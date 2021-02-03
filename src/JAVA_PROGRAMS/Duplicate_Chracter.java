package JAVA_PROGRAMS;

import java.util.Scanner;

public class Duplicate_Chracter
{

	public static void main(String[] args)
	{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("enter a string");
	 String str=scan.next();
	 System.out.println(str);
	char []a=str.toCharArray();
	int count=0;
	for(int i=0;i<str.length();i++) 
	  { 
		for(int j=1;j<str.length();j++)
		{			
			if(a[i]==a[j])
			{
			delete a[i];
			
			i--;
			
			}
			
		}
		
	}
	
	}

}
