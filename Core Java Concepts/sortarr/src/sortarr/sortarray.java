//sort the array in descending order and ascending order (5,2,8,7,1)

package sortarr;

import java.util.Arrays;

public class sortarray {
	
	public static void main(String[] args) {
		
		int arr[]= {5, 2, 8, 7, 1};
		int n=arr.length;
		int i;
		Arrays.sort(arr);
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
		for(i=n-1;i>=0;i--)
			System.out.println(arr[i]);
		
	}

}
