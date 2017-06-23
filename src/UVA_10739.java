import java.util.Scanner;

public class UVA_10739 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c =1;
		int N =Integer.parseInt(sc.nextLine());
		for(int i=0;i<N;i++){
			while(sc.hasNextLine()){
				String s =sc.nextLine();
				int count = solve(s);
				System.out.printf("Case %d: %d\n",c++,count);
			}
		}
		
		sc.close();
	}
	public static int solve(String a){
		int [][] dp = new int[a.length()+1][a.length()+1];
		String b = new StringBuilder(a).reverse().toString();
		for(int i=1;i<a.length();i++){
			for(int j=1;j<b.length();j++){
				if(a.charAt(i-1)==b.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1];
				}
				else
				{
					dp[i][j] =1 +  Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
				}
			}
		}
		
		return dp[a.length()][b.length()]/2;
		
	}
}
