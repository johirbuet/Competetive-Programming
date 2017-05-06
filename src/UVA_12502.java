import java.util.Scanner;

public class UVA_12502 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		for(int t=0;t<T;t++){
			int x =sc.nextInt();
			int y =sc.nextInt();
			int z =sc.nextInt();
			int m = z*(x + x -y)/(x+y);
			System.out.println(m);
		}
	}
}
