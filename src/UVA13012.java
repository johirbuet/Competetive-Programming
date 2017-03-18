import java.util.Scanner;

public class UVA13012 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			int  count=0;
			for(int i=0;i<5;i++)
			{
				int c=sc.nextInt();
				if(c==n)
					count++;
			}
			System.out.println(count);
		}
		sc.close();
	}
}
