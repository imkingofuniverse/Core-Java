//print second largest element

package seclarge;

import java.util.Arrays;

public class secondlargeele {
	
public static void main(String[] args) {
		
		int arr[]= {20,10,40,30,50};
		Arrays.sort(arr);
		int seclar=arr[arr.length-2];
		System.out.println("second largest number is "+seclar);	
		
	}

}
