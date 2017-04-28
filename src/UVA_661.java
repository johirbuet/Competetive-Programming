import java.util.Scanner;

public class UVA_661 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int seq =1;
		while(sc.hasNextLine())
		{
			String line =sc.nextLine();
			String [] nmc =line.split("\\s+");
			int n = Integer.parseInt(nmc[0]);
			int m = Integer.parseInt(nmc[1]);
			int c =Integer.parseInt(nmc[2]);
			boolean ok =true;
			if(n==0 && m==0 && c==0)
			{
				break;
			}
			boolean [] devices = new boolean[n];
			int [] ci =new int[n];
			for(int i=0;i<n;i++)
			{
				ci[i] = Integer.parseInt(sc.nextLine());
			}
			int maxpower =0;
			for(int i=0;i<m;i++)
			{
				int dev = Integer.parseInt(sc.nextLine())-1;
				devices[dev] = !devices[dev];
				int totalnow =0;
				for(int j=0;j<n;j++)
				{
					if(devices[j])
					{
						totalnow += ci[j];
					}
				}
				maxpower = Math.max(maxpower, totalnow);
				if(maxpower>c)
				{
					ok =false;
				}
				
			}
			if(!ok)
			{
				System.out.println("Sequence "+seq);
				System.out.println("Fuse was blown.");
				System.out.println();
			}
			else
			{
				System.out.println("Sequence "+seq);
				System.out.println("Fuse was not blown.");
				System.out.printf("Maximal power consumption was %d amperes.\n",maxpower);
				System.out.println();
			}
			seq++;
		}
	}
}
