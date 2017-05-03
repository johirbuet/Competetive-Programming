import java.util.Scanner;

public class UVA_10170 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLong())
		{
			long S =sc.nextLong();
			long D =sc.nextLong();
			for(long d =0;d<D;)
			{
				d = d + S;
				S++;
			}
			System.out.println(S-1);
		}
		sc.close();
	}
}
