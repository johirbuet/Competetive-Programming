import java.util.Scanner;

public class UVA_264 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n =sc.nextInt();
			int v = n;
			int diagonal = 1;
			while(v > diagonal){
				v = v - diagonal;
				diagonal++;
			}
			int a = (diagonal%2 == 1)? diagonal - v + 1 : v;
			int b = diagonal - a + 1;
			System.out.printf("TERM %d IS %d/%d\n", n, a, b);		
		}
		sc.close();
	}
}
