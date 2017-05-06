import java.util.Scanner;

public class UVA_12136 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int c =0;
		for(int i=0;i<N;i++)
		{
			c++;
			String w =sc.nextLine();
			
			String m = sc.nextLine();
			String [] wse = w.split(" ");
			String [] mse = m.split(" ");
			int wstart = time(wse[0]);
			int wend =time(wse[1]);
			int mstart = time(mse[0]);
			int mend = time(mse[1]);
			if((mstart<= wend && mend>= wstart))
			{
				System.out.printf("Case %d: Mrs Meeting\n",c);
			}
			else
			{
				System.out.printf("Case %d: Hits Meeting\n",c);
			}
		}
		sc.close();
		
	}
	
	public static int time(String t)
	{
		String [] hm =t.split(":");
		int m  = Integer.parseInt(hm[0])*60 + Integer.parseInt(hm[1]);
		return m;
	}
}
