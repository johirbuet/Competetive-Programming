import java.math.BigInteger;
import java.util.Scanner;

public class UVA_10106 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String f =sc.nextLine();
			String l=sc.nextLine();
			if(f==null || f.isEmpty())
			{
				break;
			}
			if(l==null || l.isEmpty())
			{
				break;
			}
			BigInteger b =new BigInteger(f);
			BigInteger b2 =new BigInteger(l);
			BigInteger b3 =b.multiply(b2);
			System.out.println(b3.toString());
		}
		sc.close();
	}
}
