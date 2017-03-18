import java.util.Scanner;

public class UVA10696 {
	public static int max=1000001;
	public static int [] mem=new int[max];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			if(n==0)
			{
				break;
			}
			System.out.println("f91("+n+") = "+f91(n));
		}
		sc.close();
	}
	public static int f91(int n)
	{
		if(mem[n]!=0)
		{
			return mem[n];
		}
		else if(n>=101)
		{
			mem[n]=n-10;
			return mem[n];
		}
		else
		{
			mem[n]=f91(f91(n+11));
			return mem[n];
		}
	}
}
