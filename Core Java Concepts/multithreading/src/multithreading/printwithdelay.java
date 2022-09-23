//create a list of elements starting from 1-5 and then print them one by one time interval between each element should be 10 seconds

package multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class printwithdelay {
	
	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		for(int n : num) {
			try {
				Thread.sleep(10000);
			}
			catch (InterruptedException exp) {
				System.err.println(exp.getMessage());
			}
			System.out.println(n);
		}
		
	}

}
