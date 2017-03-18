import java.util.Scanner;

public class UVA113 {
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        while (in.hasNext()) {
	            double n= in.nextDouble(), p = in.nextDouble();
	            System.out.format("%.0f\n",Math.pow(p, 1/n));
	        }
	        in.close();
	}
}
