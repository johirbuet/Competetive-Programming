import java.util.Arrays;
import java.util.Scanner;

public class UVA_11875 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		int c =0;
		for(int t=0;t<T;t++){
			int N = sc.nextInt();
			int [] a =new int[N];
			c++;
			for(int i=0;i<N;i++){
				a[i] =sc.nextInt();
			}
			Arrays.sort(a);
			int med =a[N/2];
			System.out.printf("Case %d: %d\n",c,med);
		}
		sc.close();
	}
}
