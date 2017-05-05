import java.util.ArrayList;
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
			for(int j= 1;j<n;j++)
			{
				if(j%Math.sqrt(n-j) ==0 && j/Math.sqrt(n-j) >0){
					list.add(j);
				}
			}
			System.out.printf("Case %d: ",c);
			for(int a :list)
			{
				System.out.print(a+" ");
			}
			System.out.println();
			c++;
		}
		sc.close();
	}

}
