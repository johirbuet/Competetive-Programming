import java.math.BigInteger;
import java.util.Scanner;

public class UVA10300 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0)
		{
			int f=sc.nextInt();
			BigInteger sum=BigInteger.ZERO;
			for(int i=0;i<f;i++)
			{
				long s=sc.nextInt();
				long a=sc.nextInt();
				long ef=sc.nextInt();
				sum=sum.add(BigInteger.valueOf(s*ef));
			}
			System.out.println(sum.toString());
		}
	}
}
