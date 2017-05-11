import java.util.Arrays;
import java.util.Scanner;

public class UVA_13109 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		for(int t=0;t<T;t++)
		{
			int M =sc.nextInt();
			long W =sc.nextLong();
			int [] w =new int[M];
			for(int i=0;i<M;i++){
				w[i] =sc.nextInt();
			}
			Arrays.sort(w);
			long curw =0;
			int count =0;
			for(int i=0;i<M;i++)
			{
				if(curw+w[i]<=W){
					count++;
					curw =curw+w[i];
				}
				else
				{
					break;
				}
			}
			System.out.println(count);
			
		}
		sc.close();
	}
}
