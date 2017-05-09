import java.util.Scanner;

public class UVA_10127 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt()){
			int n =sc.nextInt();
			int current =1;
			int digit = 1;
			while(current%n!=0){
				current = (current*10+1)%n;
				digit++;
			}
			System.out.println(digit);
		}
		sc.close();
	}
}
