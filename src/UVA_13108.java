import java.util.Scanner;

public class UVA_13108 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		for(int i=0;i<T;i++)
		{
			int n =sc.nextInt();
			int g = (n*n*n*n - 6*n*n*n+23*n*n -18*n +24)/24;
			System.out.println(g);
		}
		sc.close();
	}
	
	

}
