import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_13093 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		while(sc.hasNextLine()){
			String a =sc.nextLine();
			if(a==null | a.isEmpty())
			{
				break;
			}
			String b =sc.nextLine();
			
			String first = "";
			String last= "";
			StringTokenizer st =new StringTokenizer(a);
			while(st.hasMoreTokens()){
				first+=st.nextToken().charAt(0);
			}
			st =new StringTokenizer(b);
			while(st.hasMoreTokens()){
				last+=st.nextToken().charAt(0);
			}
			if(first.equals(last)){
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			
		}
		sc.close();
	}
}
