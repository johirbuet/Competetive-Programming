import java.util.Scanner;

public class UVA_11636 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int c =0;
		while(sc.hasNextInt())
		{
			int n= sc.nextInt();
			c++;
			if(n<0){
				break;
			}
			int res = 0;
			int start = 1;
			while(start < n)
			{
				start = start *2;
				res++;
			}
			System.out.printf("Case %d: %d\n",c,res);
		}
		sc.close();
	}
}
