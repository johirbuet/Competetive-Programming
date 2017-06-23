import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class UVA_11151 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N =Integer.parseInt(sc.nextLine());
		for(int i=0;i<N;i++){
			String s =sc.nextLine();
			System.out.println(LP(s));
		}
		sc.close();
	}
	/**
	 * If reearrangement of the characters is allowed
	 * @param s
	 * @return
	 */
	public static int longest_plaindrome(String s){
		HashSet<Character> set =new HashSet<>();
		char [] cr =s.toCharArray();
		for(char c : cr){
			if(set.contains(c)){
				set.remove(c);
			}
			else
			{
				set.add(c);
			}
		}
		int n =set.size();
		if(n!=0){
			n--;
		}
		int count = cr.length - n;
		return count;
	}
	
	/**
	 * If rearrangement of the characters is not allowed
	 * @param s
	 * @return
	 */
	public static int LP(String s){
		if(s.length()==0) return 0;
		int [][] dp =new int[s.length()+1][s.length()+1];
		int n =s.length();
		for(int i=0;i<n;i++){
			Arrays.fill(dp[i], 1);
		}
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i) == s.charAt(i+1)){
				dp[i][i+1] =2;
			}
			else
			{
				dp[i][i+1] =1;
			}
		}
		for(int size=3;size<=n;size++){
			for(int i=0;size + i <= n;i++){
				int j =i +size -1;
				if(s.charAt(i) == s.charAt(j)){
					dp[i][j] = dp[i+1][j-1] +2;
				}
				else
				{
					dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
				}
			}
		}
		
		return dp[0][n-1];
	}
}
