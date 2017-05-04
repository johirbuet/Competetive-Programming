import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class UVA_11854 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt()){
			long a =sc.nextLong();
			long b =sc.nextLong();
			long c = sc.nextLong();
			
			if(a==0 && b==0 && c==0)
			{
				break;
			}
			
			ArrayList<Long> set =new ArrayList<>();
			set.add(a);
			set.add(b);
			set.add(c);
			Collections.sort(set);
			a = set.get(0);
			b = set.get(1);
			c = set.get(2);
			if(a*a +b*b == c*c)
			{
				System.out.println("right");
			}
			else
			{
				System.out.println("wrong");
			}
		}
		sc.close();
	}

}
