import java.math.BigInteger;
import java.util.Scanner;

public class UVA_10922 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true){
			String line =sc.nextLine();
			String init =line;
			if(line.equals("0")){
				break;
			}
			
			int count = 0;
			while(true){
				BigInteger bi =BigInteger.ZERO;
				for(int i=0;i<line.length();i++){
					bi =bi.add(new BigInteger(line.substring(i, i+1)));
				}
				line =bi.toString();
				if(line.length()==1){
					count++;
					break;
				}
				else
				{
					count++;
				}
				
			}
			int num = Integer.parseInt(line);
			if(num==9){
				System.out.printf("%s is a multiple of 9 and has 9-degree %d.\n",init,count);
			}
			else
			{
				System.out.printf("%s is not a multiple of 9.\n",init);
			}
		}
		sc.close();
	}
}
