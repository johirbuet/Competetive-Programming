import java.util.Scanner;

public class UVA11450 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int M=sc.nextInt();
			int C=sc.nextInt();
			int [][] dp=new int [201][21];
			int [][] price =new int [C][20];
			for(int a=0;a<C;a++)
			{
				for(int b=0;b<20;b++)
				{
					price[a][b]=-1;
				}
			}
			for(int i=0;i<C;i++)
			{
				int cis=sc.nextInt();
				for(int k=0;k<cis;k++)
				{
					price[i][k]=sc.nextInt();
				}
				
			}
			for(int i=0;i<M+1;i++)
			{
				for(int j=0;j<C+1;j++)
				{
					dp[i][j]=-2;
				}
			}
			for(int m=0;m<=M;m++)
			{
				dp[m][0]=0;
				for(int c=1;c<=C;c++)
				{
					for(int k=0;k<price[c-1].length;k++)
					{
					//	dp[m][c]=dp[m-price[c-1][k]][c-1]+price[c-1][k];
						int ci=price[c-1][k];
						if(ci>0 && m>=ci && dp[m-ci][c-1]!=-2)
						{
							dp[m][c]=Math.max(dp[m][c],dp[m-ci][c-1]+ci);
						}
						
					}
				}
			}
			if(dp[M][C]==-2)
			{
				System.out.println("no solution");
			}
			else
			{
				System.out.println(dp[M][C]);
			}
		}
		sc.close();

	}

}
