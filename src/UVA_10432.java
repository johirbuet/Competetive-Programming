import java.util.Scanner;

public class UVA_10432 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextDouble()){
			double r =sc.nextDouble();
			double n =sc.nextDouble();
			double d =360.0/n;
			double a =n*.5*r*r*Math.sin(d*Math.PI/180);
			System.out.printf("%.3f\n",a);
		}
		sc.close();
	}
}
