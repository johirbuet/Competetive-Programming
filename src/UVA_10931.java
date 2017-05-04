import java.math.BigInteger;
import java.util.Scanner;

public class UVA_10931 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String line =sc.nextLine();
			if(line.equals("0"))
			{
				break;
			}
			BigInteger bi =new BigInteger(line,10);
			String bin =  bi.toString(2);
			int n =bin.length();
			bin =bin.replaceAll("1", "");
			int k= bin.length();
			int ones =n -k;
			System.out.printf("The parity of %s is %d (mod 2).\n",bi.toString(2),ones);
		}
		sc.close();
	}
}
