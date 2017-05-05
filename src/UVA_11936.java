import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UVA_11936 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T= sc.nextInt();
		for(int i=0;i<T;i++)
		{
			int a =sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();
			ArrayList<Integer> list =new ArrayList<>();
			list.add(a);
			list.add(b);
			list.add(c);
			Collections.sort(list);
			if(list.get(0)+list.get(1)<= list.get(2))
			{
				System.out.println("Wrong!!");
			}
			else
			{
				System.out.println("OK");
			}
		}
		sc.close();
	}
}
