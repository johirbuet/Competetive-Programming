import java.util.Scanner;

public class CF_750A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int timepassed=0;
		int solve=0;
		while(timepassed + t <=240 && solve<=n)
		{
			
			timepassed+=5*(solve+1);
			if(timepassed+t <= 240 && solve<n)
			{
				solve++;
			}
		}
		System.out.println(solve);
		sc.close();
		
	}
}
