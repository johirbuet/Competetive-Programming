import java.util.Scanner;

public class UVA10071 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int v=sc.nextInt();
			int t=sc.nextInt();
			int d=v*t*2;
			System.out.println(d);
		}
		sc.close();
	}

}
