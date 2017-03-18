import java.util.Scanner;

public class UVA11984 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int c=1;
		while(T-->0)
		{
			int C=sc.nextInt();
			int d=sc.nextInt();
			double f=9*C/5.0+32;
			f=f+d;
			double FC=(f-32)*5/9.0;
			System.out.printf("Case %d: %.2f\n",c,FC);
			c++;
		}
		sc.close();
		
	}

}
