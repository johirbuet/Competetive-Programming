import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10324 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int testCase=1;
		while ((s=br.readLine())!=null && !s.equals("0 0")) {
			int [] dp=new int [s.length()];
			dp[0]=0;
			for (int i=1;i<s.length();i++) {
				dp[i]=dp[i-1]+Math.abs(s.charAt(i)-s.charAt(i-1));
			}
			
			StringBuilder sb=new StringBuilder("Case ");
			sb.append(testCase++);
			sb.append(":\n");
			int queryCount=Integer.parseInt(br.readLine());
			for (int i=0;i<queryCount;i++) {
				StringTokenizer st=new StringTokenizer(br.readLine());
				int [] pos=new int [] {Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())};
				int min=Math.min(pos[0], pos[1]);
				int max=Math.max(pos[0], pos[1]);
				if (dp[max]==dp[min]) {
					sb.append("Yes\n");
				} else {
					sb.append("No\n");
				}
			}
			System.out.print(sb.toString());
		}
	}
}
