import java.util.Scanner;

public class UVA_108 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N =sc.nextInt();
		int [][] a =new int[N][N];
		//int [][] sum =new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				a[i][j] =sc.nextInt();
			}
		}
		for(int i=1;i<N;i++){
			for(int j=0;j<N;j++){
				a[i][j] += a[i-1][j];
			}
		}
		
		int maxsum = Integer.MIN_VALUE;
		for(int i=0;i<N;i++){
			int [] kij = new int[N];
			for(int j = i;j<N-1;j++){
				for(int k=0;k<N;k++){
					kij[k] = a[j+1][k]-a[i][k];
				}
				int s =kadane(kij, i, j);
				maxsum = Math.max(maxsum, s);
			}
		}
		System.out.println(maxsum);
		
		sc.close();
	}
	static int kadane(int [] kij,int s,int end){
		int max =kij[0];
		int maxendhere = kij[0];
		for(int i=1;i<kij.length;i++){
			maxendhere = Math.max(maxendhere + kij[i], kij[i]);
			max = Math.max(max, maxendhere);
		}
		return max;
	}
}
