import java.util.Scanner;

public class SnackDown_2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0){
			int N =sc.nextInt();
			int [] a = new int[N];
			int start = 0;
			for(int i=0;i<N;i++){
				int t =sc.nextInt();
				a[i] =t;
			}
			if(N%2 == 0)
			{
				System.out.println("no");
			}
			else
			{
				int cur =1;
				boolean ok =true;
				for(int i=0;i<N/2+1;i++){
					if(a[i]!=cur){
						ok =false;
						break;
					}
					else
					{
						cur++;
					}
				}
				for(int i=N/2+1;i<N;i++){
					if(a[i]!=cur-2){
						ok =false;
						break;
						
					}
					else
					{
						cur--;
					}
				}
				if(ok)
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}
			}
		}
	}
}
