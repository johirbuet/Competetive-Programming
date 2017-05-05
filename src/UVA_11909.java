import java.util.Scanner;

public class UVA_11909 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int l =sc.nextInt();
			int w =sc.nextInt();
			int h =sc.nextInt();
			int d =sc.nextInt();
			double p = l*Math.tan(d*Math.PI/180);
			if(p<=h){
				double v = l*w*h - 0.5*l*w*p;
				System.out.printf("%.3f mL\n",v);
			}
			else
			{
				double v = .5*h*w*h*Math.tan((90-d)*Math.PI/180);
				System.out.printf("%.3f mL\n",v);
			}
		}
		sc.close();
	}

}
