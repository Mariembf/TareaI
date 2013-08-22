
import java.io.*;
public class Pyramid {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
		int i, j , k;
		
		try {
		System.out.print("Enter number of rows:");
		        int m = Integer.parseInt(br.readLine());
		        for (i = 1; i <= m; i++) {

		    		for (k =1; k <= m-i; k++)

		    		System.out.print(" ");
		    		
		    		for (j = k+1; j <=m; j++) 

		    		System.out.print( "*");
		    		for(int l=m;l>k-1;l--)
		    		System.out.print( "*");

		    		System.out.println("");
		        }
		}
		
		catch (Exception e){
        e.printStackTrace();
		} 
	}
}
