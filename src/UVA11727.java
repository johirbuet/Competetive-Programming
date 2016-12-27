import java.util.Scanner;

public class UVA11727 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(n-->0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int mid=findmid(a, b, c);
			System.out.println("Case "+i+": "+mid);
			i++;
		}
	}
	public static int findmid(int a,int b,int c)
	{
		int mid=0;
		if((a>b && b>c) ||(c>b && b>a) )
		{
			mid=b;
		}
		if((a>c && c>b)||(b>c && c>a))
		{
			mid=c;
		}
		if((c>a && a>b) || (b>a && a>c))
		{
			mid = a;
		}
		return mid;
	}

}
