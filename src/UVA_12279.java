import java.util.Scanner;

public class UVA_12279 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c =0;
		while(sc.hasNextInt())
		{
			int n =sc.nextInt();
			if(n==0){
				break;
			}
			c++;
			int b =0;
			for(int i=0;i<n;i++)
			{
				int p = sc.nextInt();
				if( p ==0)
				{
					b--;
				}
				else
				{
					b++;
				}
			}
			System.out.printf("Case %d: %d\n",c,b);
		}
	}
}
