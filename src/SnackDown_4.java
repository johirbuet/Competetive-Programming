import java.util.Arrays;
import java.util.Scanner;

public class SnackDown_4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		while(T-->0){
			int N =sc.nextInt();
			int Q =sc.nextInt();
			int [] L = new int[N];
			for(int i=0;i<N;i++){
				L[i] =sc.nextInt();
			}
			Arrays.sort(L); // O(n*lgn) 
			for(int i=0;i<Q;i++){ 
				int K =sc.nextInt();
				int start =0;
				int end = N-1;
				int count =0;
				while(start < end){
					if(L[end]>=K){
						count++;
						end--;
					}
					else
					{
						int needed = K - L[end];
						if(end -1 - start < needed)
						{
							break;
						}
						else
						{
							start = start + needed;
							count++;
							end--;
						}
					}
				}
				System.out.println(count);
			}
		}
		sc.close();
	}
}
