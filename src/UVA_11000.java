import java.util.Scanner;

public class UVA_11000 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n =sc.nextInt();
			if(n== -1)
			{
				break;
			}
			long [] M = new long[n+1];
			M[0] = 0;
			if(n>0)
			{
				M[1] = 1;
			}
			
			for(int i =2;i<=n;i++)
			{
				M[i] = M[i-1] + M[i-2] +1;
			}
			long f = n>0?(M[n-1] + 1):1;
			System.out.println(M[n]+" "+(f+M[n]));
		}
		
		sc.close();
	}
}
