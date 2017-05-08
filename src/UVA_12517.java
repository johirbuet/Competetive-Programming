import java.util.Scanner;

public class UVA_12517 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextInt()){
			long M =sc.nextLong();
			long N =sc.nextLong();
			if(M==0 && N==0){
				break;
			}
			long n = N-M+1;
			long sum = (2*M+(n-1))*n/2;
			System.out.println(sum);
		}
		sc.close();
	}

}
