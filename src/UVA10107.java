import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UVA10107 {

	public static void main(String[] args) {
		ArrayList<Long> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			String s=sc.next();
			long l=Long.parseLong(s);
			list.add(l);
			Collections.sort(list);
			int n=list.size();
			if(n%2==0)
			{
				long a=list.get(n/2);
				long b=list.get(n/2-1);
				long median=(a+b)/2;
				System.out.println(median);
			}
			else
			{
				System.out.println(list.get(n/2));
			}
		}
	}

}
