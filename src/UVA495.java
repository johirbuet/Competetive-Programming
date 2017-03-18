import java.math.BigInteger;
import java.util.Scanner;

public class UVA495 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BigInteger [] fib =new BigInteger[5001];
		fib[0]=BigInteger.ZERO;
		fib[1]=BigInteger.ONE;
		for(int i=2;i<5001;i++)
		{
			fib[i]=fib[i-1].add(fib[i-2]);
		}
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			BigInteger f=fib[n];
			System.out.printf("The Fibonacci number for %d is %s\n",n,f.toString());
		}
		sc.close();
	}
}
