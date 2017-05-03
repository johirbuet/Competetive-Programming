import java.math.BigInteger;
import java.util.Scanner;

public class UVA_10019 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N =sc.nextInt();
		for(int i=0;i<N;i++)
		{
			int D = sc.nextInt();
			String bin = Integer.toBinaryString(D);
			bin = bin.replaceAll("0", "");
			int f =bin.length();
			String hex =String.valueOf(D);
			String bin2 =  new BigInteger(hex, 16).toString(2);
			bin2 = bin2.replaceAll("0", "");
			int l =bin2.length();
			System.out.println(f+ " "+l);
		}
		sc.close();
	}
}
