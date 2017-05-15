import java.util.Scanner;

public class UVA_11076_AC {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long [] fact = {1,1,2,6,24,120,720,5040,40320,362880,
                3628800,39916800,479001600};
		long [] P ={0,1,11,111,1111,11111,111111,1111111,11111111,111111111,
				1111111111,11111111111L,111111111111L};
		while(sc.hasNextInt()){
			int  N = sc.nextInt();
			if(N == 0){
				break;
			}
			
			int [] count = new int[10];
			int [] nums =new int[N];
			long sum = 0;
			for(int i=0;i<N;i++){
				int a = sc.nextInt();
				nums[i] = a;
				count[a]++;
			}
			
			boolean [] seen =new boolean[10];
			for(int i=0;i<N;i++)
			{
				if(seen[nums[i]])
				{
					continue;
				}
				seen[nums[i]] =true;
				long f = fact[N-1];
				for(int j =0;j<=9;j++){
					int n = count[j];
					if(n==0)
					{
						continue;
					}
					if(nums[i] == j)
					{
						n--;
					}
					f = f / fact[n];
				}
				sum =sum +nums[i]*f*P[N];
			}
			System.out.println(sum);
		}
		sc.close();
	}
	

}
