import java.util.Scanner;

public class UVA_11877 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt()){
			int n =sc.nextInt();
			if(n==0){
				break;
			}
			int sum = n/3 + getTot(n/3+n%3);
			System.out.println(sum);
		}
		sc.close();
	}
	public static int getTot(int n){
		
		if(n==2){
			return 1;
		}
		if(n<2)
		{
			return 0;
		}
		
		return n/3 + getTot(n/3+n%3);
	}
}
