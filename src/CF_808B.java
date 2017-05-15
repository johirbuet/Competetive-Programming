import java.util.Scanner;

public class CF_808B {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int k =sc.nextInt();
		int [] s =new int[n];
		double avg =0;
		double sum =0;
		int [] dp =new int[n];
		for(int i=0;i<n;i++)
		{
			s[i] =sc.nextInt();
		}
		dp[0] =s[0];
		for(int i=1;i<n;i++)
		{
			dp[i] =dp[i-1]+s[i];
		}
		
		for(int i= k-1;i<n;i++){
			sum = sum + dp[i] - ((i- k)>=0?dp[i-k]:0);
		}
		avg =sum/(n-k+1);
		System.out.printf("%.10f",avg);
		sc.close();
	}
}
