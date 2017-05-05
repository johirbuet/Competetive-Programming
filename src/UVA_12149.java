import java.util.Scanner;

public class UVA_12149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			if(n==0)
			{
				break;
			}
			long sum =0;
			for(int i =1;i<=n;i++)
			{
				sum =sum +i*i;
			}
			
			System.out.println(sum);
		}
		sc.close();
	}

}
