import java.util.Scanner;

public class UVA_369 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int N =sc.nextInt();
			int M= sc.nextInt();
			if(N==0 && M==0)
			{
				break;
			}
			int max =Math.max(M, N-M);
			int min = Math.min(M, N-M);
			int start  = max+1;
			long prod =1;
			for(int i =start;i<=N;i++)
			{
				 prod = prod *i;
				 if(prod%min ==0)
				 {
					 prod = prod/min;
					 min--;
				 }
				 
				
			}
			for(int i =min; i>0;i--)
			{
				prod =prod/i;
			}
			
			
			System.out.printf("%d things taken %d at a time is %d exactly.\n",N,M,prod);
		}
		sc.close();
	}

}
