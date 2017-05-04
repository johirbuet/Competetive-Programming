import java.math.BigInteger;
import java.util.Scanner;

public class UVA_11185 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String line = sc.nextLine();
			if(line.startsWith("-"))
			{
				break;
			}
			BigInteger bi =new BigInteger(line);
			String ter =bi.toString(3);
			System.out.println(ter);
		}
		sc.close();
	}

}
