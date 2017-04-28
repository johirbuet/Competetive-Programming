import java.util.Scanner;

public class UVA11044 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		while(T-->0)
		{
			int m =sc.nextInt();
			int n =sc.nextInt();
			int result = (m/3) * (n/3);
			System.out.println(result);
		}
	}

}
