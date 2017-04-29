import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10347 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String line =sc.nextLine();
			if(line == null || line.isEmpty())
			{
				break;
			}
			StringTokenizer st =new StringTokenizer(line);
			double m1= Double.parseDouble(st.nextToken());
			double m2 =Double.parseDouble(st.nextToken());
			double m3 = Double.parseDouble(st.nextToken());
			double sm =(m1+m2+m3)/2.0;
			double a_sq = sm*(sm-m1)*(sm-m2)*(sm-m3);
			if(a_sq<=0)
			{
				double f =-1.0;
				System.out.printf("%.3f\n",f);
			}
			else
			{
				double s =Math.sqrt(a_sq)*(4/3.0);
				System.out.printf("%.3f\n",s);
			}
		}
		sc.close();
	}

}
