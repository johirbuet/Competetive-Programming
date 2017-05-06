import java.util.Scanner;

public class UVA_11934 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int a = sc.nextInt();
			int b =sc.nextInt();
			int c =sc.nextInt();
			int d =sc.nextInt();
			int L =sc.nextInt();
			if(a==0 && b==0 && c==0 && d==0 && L==0){
				break;
			}
			int count =0;
			for(int i=0;i<=L;i++)
			{
				long f = a*i*i+b*i +c;
				if(f% d==0)
				{
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}
