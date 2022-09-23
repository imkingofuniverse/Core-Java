//print odd numbers with index

package ptoddval;

public class printoddvalue {
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6,7,8};
		int n,i;
		n=arr.length;
		for(i=0;i<n;i++)
		{
			int a=arr[i];
			if((a%2) != 0)
			{
				System.out.println(arr[i]+" at index="+i);
			}
		}
		
	}

}
