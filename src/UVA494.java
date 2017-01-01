import java.util.ArrayList;
import java.util.Scanner;

public class UVA494 {

	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
	        while (s.hasNext()) {
	            boolean start = false;
	            int count =0;
	            char[] words =  s.nextLine().toCharArray();
	            for (char st : words) {
	                if(Character.isLetter(st))
	                {
	                   if(!start)
	                   {
	                       count++;
	                       start = true;
	                   }
	                }
	                else{
	                     start= false;
	                }
	            }
	            System.out.println(count);
	        }
	        s.close();
	}

}
