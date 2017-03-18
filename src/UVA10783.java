import java.util.Scanner;

public class UVA10783 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int c=1;
		while(T-->0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int sum=0;
			for(int i=a;i<=b;i++)
			{
				sum+=(i%2==1)?i:0;
			}
			System.out.println("Case "+c+": "+sum);
			c++;
		}
		sc.close();
	}
}
