import java.util.Arrays;
import java.util.Scanner;

public class UVA_11850 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n =sc.nextInt();
			if(n==0){
				break;
			}
			int a [] =new int[n+2];
			a[0] = 0;
			a[n+1] = 1422;
			for(int i=1;i<n-1;i++){
				a[i] =sc.nextInt();
			}
			Arrays.sort(a);
			int prev = a[0];
			boolean ok =true;
			for(int i=1;i<n;i++){
				int dif = Math.abs(a[i] -prev);
				if(dif>200)
				{
					ok =false;
					break;
				}
				prev = a[i];
			}
			if(a[n-1]-a[n-2] > 100)
			{
				ok = false;
			}
			if(ok){
				System.out.println("POSSIBLE");
			}
			else{
				System.out.println("IMPOSSIBLE");
			}
		}
		sc.close();
	}
}
