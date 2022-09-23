//create two 3x3 matrix (1,1,1;2,2,2;3,3,3) (6,6,6;7,7,7;8,8,8) ;create a program to add and multiply these two matrix and print the output

package matadd;

public class matrixadd {
	
	public static void main(String[] args) {
		
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int b[][]= {{6,6,6},{7,7,7},{8,8,8}};
		int c[][] = {{0,0,0},{0,0,0},{0,0,0}};
		int i,j,k;
		
		
		System.out.println("addition of two matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(a[i][j]+b[i][j]+" ");
			System.out.println(" ");
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(k=0;k<3;k++)
				{
					c[i][j]=(a[i][k]*b[k][j])+c[i][j];
				}
			}
		}
		System.out.println("Multiplication of two matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				System.out.print(c[i][j]+" ");
			System.out.println(" ");
		}
		
		
	}

}
