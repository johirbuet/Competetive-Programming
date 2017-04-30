import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10341 {

	public static int p,q,r,s,t,u;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String line =sc.nextLine();
			StringTokenizer st =new StringTokenizer(line);
			p =Integer.parseInt(st.nextToken());
			q =Integer.parseInt(st.nextToken());
			r =Integer.parseInt(st.nextToken());
			s =Integer.parseInt(st.nextToken());
			t =Integer.parseInt(st.nextToken());
			u =Integer.parseInt(st.nextToken());
			if(f(0)*f(1)>0)
			{
				System.out.println("No solution");
			}
			else
			{
				System.out.printf("%.4f\n", bisection());
			}
			
		}
		sc.close();
	}
	
	public static double bisection()
	{
		double eps =Math.pow(10, -7);
		double low =0;
		double high =1;
		while(low+eps <high)
		{
			double x =(low+high)/2;
			if(f(low)*f(x)<=0)
			{
				high =x;
			}
			else
			{
				low =x;
			}
		}
		return (low+high)/2;
	}
	public static double f(double x)
	{
		return  p*Math.exp(-x) + q*Math.sin(x) + r*Math.cos(x) + s*Math.tan(x) + t*x*x + u;
	}

}
