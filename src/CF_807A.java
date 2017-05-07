import java.util.HashMap;
import java.util.Scanner;

public class CF_807A {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N =sc.nextInt();
		int [] a =new int[N];
		int [] b =new int[N];
		int changecount =0;
		for(int i=0;i<N;i++)
		{
			a[i] =sc.nextInt();
			b[i] =sc.nextInt();
			if(a[i] - b[i] != 0)
			{
				changecount++;
			}
		}
		if(changecount !=0)
		{
			System.out.println("rated");
		}
		else
		{
			boolean unrated = false;
			for(int i=1;i<N;i++)
			{
				if(a[i] > a[i - 1]){
					System.out.println("unrated");
					unrated =true;
					break;
				}
				
			}
			if(!unrated)
			{
				System.out.println("maybe");
			}
		}
		sc.close();
	}
}
