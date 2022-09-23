//Program to find the frequency of each element of an array

package freqinarr;

public class frequencyofelement {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,8,3,2,2,2,5,1};
		int cou[] =new int[arr.length];
		int visited=-1;
		int i,j,count=0,n;
		n=arr.length;
		
		for(i=0;i<n;i++)
		{
			count=1;
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					cou[j]=visited;
				}
				
			}
			 if(cou[i] != visited)
				 cou[i] = count;
		}
		for(i=0;i<n;i++)
		{
			if(cou[i]!=visited)
				System.out.println(arr[i]+"="+cou[i]);
		}
		
	}

}
