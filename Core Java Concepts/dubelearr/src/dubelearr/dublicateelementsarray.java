//print dublicate elements in an array

package dubelearr;

public class dublicateelementsarray {
	
	public static void main(String[] args) {
		
		int arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3};
		int n=arr.length;
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[i]);
			}
				
		}
		
		
	}

}
