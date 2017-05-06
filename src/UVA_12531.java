import java.util.Scanner;

public class UVA_12531 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int a =sc.nextInt();
			if(a%6==0)
			{
				System.out.println("Y");
			}
			else
			{
				System.out.println("N");
			}
		}
		sc.close();
	}
}
