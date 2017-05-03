import java.util.Scanner;

public class UVA_10346 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int N =sc.nextInt();
			int K = sc.nextInt();
			int empty = 0;
			int sum = N;
			while(N>=K)
			{
				sum+= N/K;
				N = N/K+ N%K;
			}
			/**
			 * There is a trick here also O(1)  : N + (N-1)/(K-1)
			 */
			System.out.println(sum);
		}
		sc.close();
	}
	
}
