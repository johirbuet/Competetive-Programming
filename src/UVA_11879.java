import java.util.Scanner;

public class UVA_11879 {
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
				n =n%17;
			}
			if(n ==0){
				System.out.println(1);
			}
			else
			{
				System.out.println(0);
			}
		}
		sc.close();
	}
}
