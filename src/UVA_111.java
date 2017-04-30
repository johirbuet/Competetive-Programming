import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_111 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String line =sc.nextLine();
		StringTokenizer st =new StringTokenizer(line);
		int [] orig =new int[N];
		
		for(int i=0;i<N;i++)
		{
			orig[Integer.parseInt(st.nextToken())-1] = i;
		}
		while(sc.hasNextLine())
		{
			line =sc.nextLine();
			if(line==null || line.isEmpty())
			{
				break;
			}
			int [] rank =new int[N];
			st =new StringTokenizer(line);
			for(int i=0;i<N;i++)
			{
				rank[Integer.parseInt(st.nextToken())-1] = i;
			}
			int [][] dp =new int[N+1][N+1];
			for(int i=1;i<=N;i++)
			{
				for(int j=1;j<=N;j++)
				{
					if(orig[i-1] == rank[j-1])
					{
						dp[i][j] = dp[i-1][j-1]+1;
					}
					else
					{
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					}
				}
			}
			System.out.println(dp[N][N]);
			
		}
		sc.close();
	}

}
