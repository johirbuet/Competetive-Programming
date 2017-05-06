import java.util.Scanner;

public class UVA_12459 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long [] male = new long[81];
		long [] female = new long[81];
		male[1] =1;
		female[1] =0;
		for(int i=2;i<81;i++)
		{
			male[i] = male[i-1] + female[i-1];
			female[i] =male[i-1];
		}
		while(sc.hasNextInt())
		{
			int a =sc.nextInt();
			if(a ==0)
			{
				break;
			}
			System.out.println(male[a]+female[a]);
		}
		sc.close();
	}
}
