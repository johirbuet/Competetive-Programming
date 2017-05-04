import java.util.Scanner;

public class UVA_10499 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			long n =sc.nextInt();
			if(n<-0)
			{
				break;
			}
			if(n==1)
			{
				System.out.println("0%");
			}
			else
			{
				System.out.println((n*25)+"%");
			}
		}
		sc.close();
		
	}
}
