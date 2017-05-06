import java.util.Scanner;

public class UVA_10970 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int m =sc.nextInt();
			int n= sc.nextInt();
			System.out.println(m*n-1);
		}
		sc.close();
	}
}
