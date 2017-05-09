import java.util.Scanner;

public class UVA_10929 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLine()){
			String num =sc.nextLine();
			if(num.equals("0")){
				break;
			}
			int  n =0;
			for(int i=0;i<num.length();i++)
			{
				n = n*10 + (num.charAt(i)-'0');
				n =n%11;
			}
			if(n ==0){
				System.out.println(num+" is a multiple of 11.");
			}
			else
			{
				System.out.println(num+" is not a multiple of 11.");
			}
		}
		sc.close();
	}
}
