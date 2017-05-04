import java.util.Scanner;

public class UVA_10550 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int P =sc.nextInt();
			int a =sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();
			if(a== 0 &&  b==0 && c== 0 && P ==0)
			{
				break;
			}
			int deg = 720;
			int start = P < a ?(40-a+P): (P-a);
			deg = deg + start * 9;
			int trav = a > b? (40 + b -a) : (b -a);
			deg =deg  + 360 + trav *9;

			trav = (b < c)?(40 +b  - c):(b -c);
			deg =deg + trav *9;
			System.out.println(deg);
			
		}
	}
}
