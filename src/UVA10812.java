import java.util.Scanner;

public class UVA10812 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
			int sum=sc.nextInt();
			int dif=sc.nextInt();
			int max=(sum+dif);
			int min=(sum-dif);
			if(max%2==0 && min%2==0 && max>=0 && min>=0)
			{

				System.out.println(max/2+" "+min/2);
			}
			else
			{
				System.out.println("impossible");
			}
		}
		sc.close();
	}

}
