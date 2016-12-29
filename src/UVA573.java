import java.util.Scanner;

public class UVA573 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			double H = sc.nextDouble();
			double U = sc.nextDouble();
			double D = sc.nextDouble();
			double F = sc.nextDouble();
			if(H == 0 && U == 0 && D == 0 && F == 0) break;
			double height = 0;
			double speedUp = (U * F)/100;
			int sum = 0;
			boolean success = true;
			while(true) {
				sum++;
				height = height + U;
				if(height > H) break;
				height = height - D;
				if(height < 0.0) {
					success = false;
					break;
				}
				if(U - speedUp > 0.0) {
					U = U - speedUp;
				} else {
					U = 0;
				}
			}
			if(success) System.out.println("success on day " + sum);
			else System.out.println("failure on day " + sum);
		}
		
	}

}
