import java.util.Scanner;

public class UVA11547 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		while(T-->0)
		{
			long n =sc.nextLong();
			n = n *567;
			n = n/9;
			n =n +7492;
			n =n *235;
			n =n/47;
			n=n-498;
			String s =String.valueOf(n);
			System.out.println(s.charAt(s.length()-2));
			
		}
	}

}
