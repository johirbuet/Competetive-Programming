import java.util.Scanner;

public class UVA_10323 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLong()){
			long n =sc.nextLong();
			long prod =1;
			boolean over =false;
			boolean underflow = false;
			if(n<0){
				int n1 = (int)Math.abs(n);
				if(n1%2==0)
				{
					underflow =false;
				}
				else
				{
					underflow =true;	
				}
				
			}
			for(int i=2;i<=n;i++)
			{
				prod =prod *i;
				if(prod>6227020800L){
					over =true;
					break;
				}
			}
			if(prod<10000 && !underflow){
				System.out.println("Underflow!");
			}
			else if(over || underflow){
				System.out.println("Overflow!");
			}
			else
			{
				System.out.println(prod);
			}
		}
		sc.close();
	}
	
	
}
