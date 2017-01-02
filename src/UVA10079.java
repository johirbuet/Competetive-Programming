import java.util.Scanner;

public class UVA10079 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			long n=sc.nextInt();
			if(n<0)
			{
				break;
			}
			long nums=n*(n+1)/2+1;
			System.out.println(nums);
		}
		sc.close();
	}
}
