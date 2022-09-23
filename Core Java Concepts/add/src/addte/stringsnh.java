package addte;

public class stringsnh {
	
	public static void main(String[] args) {
		
		String s1="r_n";
		String s2="run:rsn:psn:cap";
		
		String[] s3 = s2.split(":");
		for(String a : s3)
		System.out.println(a); 
		System.out.println(s3.length);
		int len=s3.length;
		
		String s4 = "";
		StringBuilder sb = new StringBuilder(s4);


		
		for(int i=0;i<len;i++)
		{
			if(s1.charAt(0)==s3[i].charAt(0) && s1.charAt(2)==s3[i].charAt(2))
			{
				System.out.print(s3[i].toUpperCase());
				sb.append(s3[i].toUpperCase());
			}
		}
		sb.insert(3, ':');
		System.out.println();
		System.out.println(sb);
		
	}

}
