import java.util.ArrayList;
import java.util.Scanner;

public class UVA_10940 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int [] dp = new int [500001];
		dp[1] = 1;
		dp[2] =2;
		dp[3] =2;
		dp[4] =4;
		int rem =2;
		for(int i=5;i<500001;i++)
		{
			dp[i] =rem;

			if(i == rem)
			{
				rem = 2;
				
			}
			else
			{
				rem =rem +2;
			}
		}
		while(sc.hasNextInt())
		{
			int n =sc.nextInt();
			
			if(n==0)
			{
				break;
			}
			
			System.out.println(dp[n]);
		}
		sc.close();
	}
}
