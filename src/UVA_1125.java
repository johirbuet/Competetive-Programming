import java.util.Scanner;

public class UVA_1125 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N =sc.nextInt();
		int [][] dp =new int[10001][10];
		for(int i=1;i<=10000;i++)
		{
			int t =i;
			for(int a =0;a<10;a++)
			{
				dp[i][a] = dp[i-1][a];
			}
			while(t>0)
			{
				dp[i][t%10]++;
				t =t/10;
			}
		}
		
		for(int j=0;j<N;j++)
		{
			int n= sc.nextInt();
			for(int i=0;i<10;i++)
			{
				System.out.print(dp[n][i]);
				if(i<9)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
