import java.util.Arrays;
import java.util.Scanner;

public class UVA_543 {
	public static boolean [] primes;
	public static void seiveOfEratosThenes()
	{
		primes =new boolean[1000000];
		Arrays.fill(primes, true);
		primes[0] =false;
		primes[1] =false;
		int len = (int)Math.sqrt(1000000.0);
		for(int i=2;i<=len;i++)
		{
			if(primes[i])
			{
				for(int k= i*i;k<1000000;k+=i)
				{
					primes[k] = false;
				}
			}
		}
		primes[2] =false;
	}
	public static void main(String[] args) {
		seiveOfEratosThenes();
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int n =sc.nextInt();
			if(n==0)
			{
				break;
			}
			for(int a=3;a<n;a++)
			{
				if(primes[a])
				{
					int b =n-a;
					if(primes[b])
					{
						System.out.printf("%d = %d + %d\n",n,a,b);
						break;
					}
				}
			}
		}
		sc.close();
	}

}
