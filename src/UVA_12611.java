import java.util.Scanner;

public class UVA_12611 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T =sc.nextInt();
		int c=0;
		for(int i=0;i<T;i++)
		{
			int  R =sc.nextInt();
			c++;
			int l = (int)(R/0.2);
			int w =(int)(l*.6);
			int lx = -(int)(l*.45);
			int rx = (int)(l*.55);
			int ly = w/2;
			System.out.println("Case "+c+":");
			System.out.println(lx +" "+ly);
			System.out.println(rx+" "+ly);
			System.out.println(rx+" "+(-ly));
			System.out.println(lx+" "+(-ly) );
		}
		sc.close();
	}
}
