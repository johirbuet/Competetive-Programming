import java.util.Scanner;

public class UVA_10192 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c =1;
		while(sc.hasNextLine()){
			String a =sc.nextLine();
			if(a.equals("#")){
				break;
			}
			String b =sc.nextLine();
			int count = LCS(a, b);
			System.out.printf("Case #%d: you can visit at most %d cities.\n",c++,count);
		}
		sc.close();
	}
	
	public static int LCS(String a,String b){
		int [][] dp = new int[a.length()+1][b.length()+1];
		for(int i=0;i<a.length()+1;i++){
			for(int j=0;j<b.length()+1;j++){
				if(i==0 || j==0){
					dp[i][j] =0;
				}
				else if(a.charAt(i-1)==b.charAt(j-1)){
					dp[i][j] = dp[i-1][j-1] +1;
				}
				else{
					dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[a.length()][b.length()];
	}
}
