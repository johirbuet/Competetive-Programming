import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class UVA11799 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int i=1;
		while(T-->0)
		{
			int n=sc.nextInt();
			int [] speeds=new int[n];
			for(int j=0;j<n;j++)
			{
				speeds[j]=sc.nextInt();
			}
			Arrays.sort(speeds);
			int max=speeds[n-1];
			System.out.println("Case "+i+": "+max);
			i++;
		}
	}

}
