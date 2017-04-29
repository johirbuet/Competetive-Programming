import java.util.Scanner;

public class UVA_10286 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextDouble())
		{
			double d =sc.nextDouble();
			double res= d*Math.sin(108*Math.PI/180.0)/ Math.sin(63*Math.PI/180.0);
			System.out.printf("%.10f\n",res);
		}
		sc.close();
	}

}

