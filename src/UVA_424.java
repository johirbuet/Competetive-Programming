import java.math.BigInteger;
import java.util.Scanner;

public class UVA_424 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		BigInteger sum =BigInteger.ZERO;
		while(sc.hasNextLine()){
			String line =sc.nextLine();
			if(line.equals("0"))
			{
				break;
			}
			BigInteger b =new BigInteger(line);
			sum =sum.add(b);
		}
		sc.close();
		System.out.println(sum.toString());
	}
}
