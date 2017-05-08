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
			int a [] =new int[n];
			for(int i=0;i<n;i++){
				a[i] =sc.nextInt();
			}
			Arrays.sort(a);
			boolean ok =true;
			for(int i=1;i<n;i++){
				int dif = Math.abs(a[i] -a[i-1]);
				if(dif>200)
				{
					ok =false;
					break;
				}
			}
			if(1422-a[n-1]>100)
			{
				ok =false;
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
