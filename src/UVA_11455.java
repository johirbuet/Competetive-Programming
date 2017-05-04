import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class UVA_11455 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N =sc.nextInt();
		for(int i=0;i<N;i++)
		{
			int a =sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();
			int d =sc.nextInt();
			HashSet<Integer> set =new HashSet<>();
			set.add(a);
			set.add(b);
			set.add(c);
			set.add(d);
			if(set.size()==1)
			{
				System.out.println("square");
			}
			else if(set.size()==2)
			{
				System.out.println("rectangle");
			}
			else
			{
				ArrayList<Integer> list =new ArrayList<>();
				list.add(a);
				list.add(b);
				list.add(c);
				list.add(d);
				Collections.sort(list);
				if(list.get(0)+list.get(1)+list.get(2) > list.get(3))
				{
					System.out.println("quadrangle");
				}
				else
				{
					System.out.println("banana");
				}
			}
		}
		sc.close();
	}
}
