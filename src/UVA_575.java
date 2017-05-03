import java.util.Scanner;

public class UVA_575 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String line =sc.nextLine();
			
			int n=0;
			int k = line.length();
			for(char c : line.toCharArray())
			{
				n = n + (int) (Math.pow(2, k--)-1) *(c-'0');
			}
			if(n==0)
			{
				break;
			}
			System.out.println(n);
		}
		sc.close();
	}
}
