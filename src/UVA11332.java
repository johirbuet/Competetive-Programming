import java.util.Scanner;

public class UVA11332 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			if(n==0)
			{
				break;
			}
			System.out.println(fn(n));
		}
		sc.close();
	}
	public static long fn(int n)
	{
		if(n<10)
		{
			return n;
		}
		int sum=0;
		while(true)
		{
			
			while(n!=0)
			{
				int m=n%10;
				n=n/10;
				sum+=m;
			}
			
			n=sum;
			
			if(sum<10)
			{
				break;
			}
			sum=0;
		}
		
		return sum;
	}
}
