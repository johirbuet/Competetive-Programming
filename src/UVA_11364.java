import java.util.Arrays;
import java.util.Scanner;

public class UVA_11364 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		for(int i=0;i<T;i++){
			int N =sc.nextInt();
			int [] a =new int[N];
			for(int j=0;j<N;j++)
			{
				a[j] =sc.nextInt();
			}
			Arrays.sort(a);
			int l = a[0];
			int r = a[a.length-1];
			System.out.println(2*(r-l));
		}
		sc.close();
	}

}
