import java.util.Scanner;

public class UVA_374 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLong())
		{
			
			long B = sc.nextLong();
			long P = sc.nextLong();
			long M= sc.nextLong();
			System.out.println(mod(B, P, M));
			
		}
		sc.close();
	}
	
	public static long mod(long B,long P,long M)
	{
		if(P==0)
		{
			if(M==1)
			{
				return 0;
			}
			return 1;
		}
		if(P%2==0)
		{
			long x = mod(B,P/2,M);
			return (x*x)%M;
		}
		else
		{
			return (B%M * mod(B,P-1,M))%M;
		}
	}

}
