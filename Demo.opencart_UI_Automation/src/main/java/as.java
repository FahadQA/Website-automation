import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class as {
	
	
	static long simpleArraySum(long[] ar) {
		   
		long sum = 0; // initialize sum 
         
       
        // Iterate through all elements and add them to sum 
        for (int i = 0; i < ar.length; i++) 
        {
           sum = sum+ar[i];
           System.out.println(sum);
		
        }
        return sum; 

	    }
	
	  
	 static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		 
		 List<Integer> res = new ArrayList<Integer>();
		 int res_a = 0;
	        int res_b = 0;
	         int i;
	         
	         for(i=0;i<a.size();i++)
	         {
	             if(a.get(i)>b.get(i))
	             {
	                  res_a = res_a + 1;
	             }
	             else if(b.get(i)>a.get(i))
	             {
	                 res_b = res_b + 1;
	             }
	             
	         }
	         res.add(res_a);
	         res.add(res_b);

	          return res;
	    }

	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> a = new ArrayList<Integer>();

	        for (int i = 0; i < 3; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a.add(aItem);
	        }

	        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> b = new ArrayList<Integer>();

	        for (int i = 0; i < 3; i++) {
	            int bItem = Integer.parseInt(bItems[i]);
	            b.add(bItem);
	        }

	        List<Integer> result = compareTriplets(a, b);

	        for (int i = 0; i < result.size(); i++) {
	            bufferedWriter.write(String.valueOf(result.get(i)));

	            if (i != result.size() - 1) {
	                bufferedWriter.write(" ");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
		 
	
		 


}
}

