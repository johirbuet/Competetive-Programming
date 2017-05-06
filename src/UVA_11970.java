import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UVA_11970 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		int c =1;
		for(int i=0;i<T;i++)
		{
			int n =sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			int qn = (int) Math.sqrt(n);
			for(int j= qn;j>=1;j--)
			{
				int x = n -j*j;
				if(x %j ==0 && x>0)
				{
					list.add(x);
				}
			}
			Collections.sort(list);
			System.out.printf("Case %d: ",c);
			for(int s=0; s<list.size();s++)
			{
				System.out.print(list.get(s));
				if(s<list.size()-1)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			c++;
		}
		sc.close();
	}

}
