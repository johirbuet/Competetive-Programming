import java.util.Scanner;

public class UVA_11723 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c =0;
		while(sc.hasNextInt())
		{
			int R =sc.nextInt();
			int n =sc.nextInt();
			if(R==0 && n ==0)
			{
				break;
			}
			c++;
			int count =0;
			R =R -n;
			boolean ok =true;
			while(R>0)
			{
				R = R - n;
				count++;
				if(count > 26)
				{
					ok =false;
					break;
				}
			}
			if(!ok)
			{
				System.out.printf("Case %d: impossible\n",c);
			}
			else
			{
				System.out.printf("Case %d: %d\n",c,count);
			}
			
		}
	}
}
