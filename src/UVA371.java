import java.util.Scanner;

public class UVA371 {


	private final static int _MaxValue = 1000000;
	private final static long[] memo = new long[_MaxValue];

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			long a=sc.nextLong();
			long b=sc.nextLong();
			if(a==0 && b==0)
			{
				break;
			}
			long count=0;
			long v=0;
			long start=Math.min(a,b);
			long end=Math.max(a,b);
			a=start;
			b=end;
			for(long i=start;i<=end;i++)
			{
				long n=i;
				long c=0;
				while(true)
				{
					if(n<_MaxValue && memo[(int)n]!=0)
					{
						c=c+memo[(int)n];
						break;
					}
					if(n%2==0)
					{
						n=n/2;
						c++;
						if(n==1)
						{
							break;
						}
					}
					else
					{
						n=3*n+1;
						c++;
						
					}
				}
				if(i<_MaxValue)
				{
					memo[(int)i]=c;
				}
				
				if(c>count)
				{
					count=c;
					v=i;
				}
			}
			System.out.println("Between "+a+" and "+b+", "+v+" generates the longest sequence of "+count+" values.");
		}
		sc.close();
	}

}