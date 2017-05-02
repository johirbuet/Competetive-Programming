import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class UVA_591 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int cs =1;
		while(sc.hasNextInt())
		{
			int N = sc.nextInt();
			if(N==0)
			{
				break;
			}
	
			int [] arr = new int[N];
			int sum =0;
			for(int i=0;i<N;i++)
			{
				arr[i] =sc.nextInt();
				sum+=arr[i];
			}
			int lev = sum/N;
			int res =0;
			for(int i=0;i<N;i++)
			{
				res = res+ ((arr[i] -lev)>0?(arr[i] -lev):0);
			}
			System.out.printf("Set #%d\n",cs);
			cs++;
			System.out.printf("The minimum number of moves is %d.\n",res);
			System.out.println();
		}
	}

}
