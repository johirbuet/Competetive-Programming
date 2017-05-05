import java.math.BigInteger;
import java.util.Scanner;

public class UVA_10070 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c =0;
		while(sc.hasNextLine())
		{
			String line =sc.nextLine();
			if(line ==null || line.isEmpty())
			{
				break;
			}
			if(c>0)
			{
				System.out.println();
			}
			c++;
			BigInteger year = new BigInteger(line);
			boolean none =true;
			boolean leap =false;
			if(year.mod(BigInteger.valueOf(400)).equals(BigInteger.ZERO) || (year.mod(BigInteger.valueOf(4)).equals(BigInteger.ZERO) && !year.mod(BigInteger.valueOf(100)).equals(BigInteger.ZERO)))
			{
				System.out.println("This is leap year.");
				none = false;
				leap =true;
			}
			if(year.mod(BigInteger.valueOf(15)).equals(BigInteger.ZERO))
			{
				System.out.println("This is huluculu festival year.");
				none =false;
			}
			if(leap && year.mod(BigInteger.valueOf(55)).equals(BigInteger.ZERO))
			{
				System.out.println("This is bulukulu festival year.");
				none =false;
			}
			
			if(none)
			{
				System.out.println("This is an ordinary year.");
			}
			
			
		}
		sc.close();
	}
}
