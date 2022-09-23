//create an integer array of size 5,and put the elements (10,20,30,40,50) and print sum

package arrtst;


public class arraytest {
	
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		int i,sum=0;
		for(i=0;i<5;i++)
			System.out.println(arr[i]);
		for(int index:arr)
			System.out.println(index);
		for(int index:arr)
		{
			sum=sum+index;
		}
		System.out.println("sum of elements ="+sum);
		
	}

}
