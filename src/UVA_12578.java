import java.util.Scanner;

public class UVA_12578 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		for(int i=0;i<T;i++)
		{
			int L =sc.nextInt();
			double w =L*.6;
			double r = L*.2;
			double Ac =Math.PI*r*r;
			double g =L*w-Ac;
			System.out.printf("%.2f %.2f\n",Ac,g);
		}
		sc.close();
	}
}
