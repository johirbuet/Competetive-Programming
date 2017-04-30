import java.util.Scanner;

public class UVA_357 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int [] coins ={1,5,10,25,50};
		long [] dp = new long[30001];
		dp[0] = 1;
		for(int i =0; i<coins.length;i++)
		{
			for(int j=coins[i];j<=30000;j++)
			{
				dp[j] = dp[j]+ dp[j -coins[i]];
			}
		}
		while(sc.hasNextInt())
		{
			int n =sc.nextInt();
			
			if(dp[n] == 1)
			{
				System.out.printf("There is only 1 way to produce %d cents change.\n",n);
			}
			else
			{
				System.out.printf("There are %d ways to produce %d cents change.\n",dp[n],n);
			}
		}
		sc.close();
	}

}
