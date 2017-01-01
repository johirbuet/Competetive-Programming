import java.util.Scanner;

public class UVA11461 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0 && b==0)
			{
				break;
			}
			int count=0;
			for(int i=a;i<=b;i++)
			{
				int r=(int)Math.sqrt(i);
				if(r*r==i)
				{
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}
