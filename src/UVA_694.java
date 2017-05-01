import java.util.Scanner;

public class UVA_694 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c =1;
		while(sc.hasNextLong())
		{
			long A =sc.nextLong();
			long L =sc.nextLong();
			if(A < 0  && L < 0)
			{
				break;
			}
			int count = count(A,L);
			System.out.printf("Case %d: A = %d, limit = %d, number of terms = %d\n",c,A,L,count);
			c++;
		}
	}

	public static int count(long n,long limit)
	{
		int count = 1;
	while(n!=1)
	{
		if(n%2==0)
		{
			n =n/2;
			
		}
		else
		{
			if( 3*n+1>limit)
			{
				break;
			}
			
			n =3 *n+1;
			
		}
		count++;
		
	}
	return count;
	}

}
