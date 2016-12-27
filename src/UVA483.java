import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA483 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		while(sc.hasNextLine())
		{
			
			String s=sc.nextLine();
			if(s.equals("exit"))
			{
				break;
			}
			StringTokenizer st=new StringTokenizer(s);
			while(st.hasMoreTokens())
			{
				String slt=st.nextToken();
				sb.append((new StringBuilder(slt).reverse().toString())+" ");
			}
			String sa=sb.toString().substring(0,sb.toString().length()-1);
			sb=new StringBuilder();
			sb.append(sa);
			sb.append("\n");
		}
		
		System.out.println(sb.toString().substring(0, sb.toString().length()-1));
		sc.close();
	}
}
