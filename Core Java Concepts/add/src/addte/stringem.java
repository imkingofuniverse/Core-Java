package addte;

public class stringem {
	
	public static void main(String[] args) {
		
		int pos=1,n=0;
		char arr[]= {'a','e','i','o','u','a','e','i','o','u'};
		String str="ttt mtt";
		StringBuilder sb = new StringBuilder(str);
	    for(int i=0;i<str.length();i++)
	    {
	    	if(str.charAt(i)==' ')
	    	{
	    		pos=pos+1;
	    	}
	    	else if(str.charAt(i)!=' ')
	    	{
	    		sb.insert(pos, arr[n]);
	    		pos=pos+2;
	    		n=n+1;
	    	}
	    }
	    System.out.println(sb);
	}

}
