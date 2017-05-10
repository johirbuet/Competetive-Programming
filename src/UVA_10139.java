import java.util.Scanner;

public class UVA_10139 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt()){
			int n =sc.nextInt();
			int m =sc.nextInt();
			int prod =1;
			boolean ok =false;
			for(int i=n;i>=1;i--){
				prod =prod *i;
				if(prod%m==0){
					prod = prod/m;
					ok =true;
					break;
				}
			}
			if(ok){
				System.out.printf("%d divides %d!\n",m,n);
			}
			else
			{
				System.out.printf("%d does not divide %d!\n",m,n);
			}
		}
		sc.close();
	}
}
