package ARRAYS_PROGRAMS;

public class Move_0_at_the_end {

	public static void main(String[] args) {
		 int arr[]= {1,0,2,3,0,4,0,5,0,6};
		 int count=0;
		 int len=arr.length;
		 for(int i=0;i<len;i++)
		 {
		    if(arr[i]!=0)
			 {
		        arr[count++]=arr[i];
				 
			 }
		 }
		 while(count<len)
		 {
			 arr[count++]=0;
			 
		 }
		 
		 for(int j=0;j<len;j++)
		 {
			 System.out.print(" "+arr[j]);
		 }

	}

}
