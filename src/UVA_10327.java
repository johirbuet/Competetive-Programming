import java.util.Scanner;

public class UVA_10327 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int N =sc.nextInt();
			int [] a =new int[N];
			for(int i=0;i<N;i++)
			{
				a[i] =sc.nextInt();
			}
			
			int swap =0;
			for(int i=0;i<N-1;i++)
			{
				for(int j=i+1;j<N;j++)
				{
					if(a[j]<a[i])
					{
						swap++;
					}
				}
			}
			System.out.println("Minimum exchange operations : "+swap);
		}
	}
}
