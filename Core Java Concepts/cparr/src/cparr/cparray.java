//copy elements of array

package cparr;

public class cparray {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		int arrb[]=new int[arr.length];
		int i,j,n;
		n=arr.length;
		for(i=0;i<n;i++)
		{
			arrb[i]=arr[i];
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arrb[i]);
		}
		
	}

}
