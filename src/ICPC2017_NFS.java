import java.util.Scanner;

public class ICPC2017_NFS {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N =sc .nextInt();
		int T =sc.nextInt();
		int [] D = new int[N];
		int S [] = new int[N];
		int total =0;
		for(int i =0;i<N;i++){
			D[i] =sc.nextInt();
			total+= D[i];
			S[i] =sc.nextInt();
		}
		double time1 = D[0]*(double)T/(double)total;
		double c = S[0] - (double)D[0]/time1;
		System.out.println(c);
		sc.close();
	}
}
