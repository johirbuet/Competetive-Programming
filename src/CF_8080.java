import java.util.Scanner;

public class CF_8080 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		long year =sc.nextLong();
		long n = String.valueOf(year).length();
		long first =Integer.parseInt(String.valueOf(year).substring(0,1));
		long w = 0;
		if(n==1)
		{
			w =1;
		}
		if(n>1){
			w = (first+1)*(int)Math.pow(10, n-1) - year;
		}
		System.out.println(w);
		sc.close();
	}
}
