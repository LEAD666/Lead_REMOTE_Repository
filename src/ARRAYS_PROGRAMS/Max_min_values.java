package ARRAYS_PROGRAMS;

public class Max_min_values {

	public static void main(String[] args)
	{
	int a[]= {5,4,3,2,1,6,7,9,8};
	int max=0;
	int min=0;
	int temp=0;
	for(int i=0;i<a.length;i++)
	{
		
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				max=a[i];
			    temp=a[j];
			}
				
			else if(temp<a[j])
			{
			  min=temp;
				
			 }
		}
	}
	System.out.println("max value is"+ max);
	System.out.println("max value is"+ min);
	
	

	}

}
