import java.util.Scanner;

public class UVA_11764 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		for(int i=1;i<=T;i++){
			int n =sc.nextInt();
			int [] w =new int[n];
			for(int a =0;a<n;a++)
			{
				w[a] =sc.nextInt();
			}
			int start =w[0];
			int low =0;
			int high =0;
			for(int a = 1;a<n;a++){
				if(w[a]>start){
					high++;	
				}
				else if(w[a]<start)
				{
					low++;
				}
				start =w[a];
			}
			System.out.printf("Case %d: %d %d\n",i,high,low);
		}
		sc.close();
	}
}
