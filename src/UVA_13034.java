import java.util.Scanner;

public class UVA_13034 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		int C = 0;
		for(int i=0;i<T;i++)
		{
			boolean solved =true;
			C++;
			for(int j=0;j<13;j++)
			{
				int a =sc.nextInt();
				solved =solved && (a>0);
			}
			if(solved)
			{
				System.out.printf("Set #%d: Yes\n",C);
			}
			else
			{
				System.out.printf("Set #%d: No\n",C);
			}
		}
		sc.close();
	}
}
