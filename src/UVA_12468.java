import java.util.Scanner;

public class UVA_12468 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int a =sc.nextInt();
			int g =sc.nextInt();
			if(a== -1 && g==-1)
			{
				break;
			}
			
			int f =Math.abs(g-a);
			int s = (99-Math.abs(g - a)+1);
			int min = Math.min(f, s);
			System.out.println(min);
			
		}
		sc.close();
	}
}
