import java.util.Scanner;

public class UVA_12372 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		int c =1;
		for(int t= 0;t<T;t++)
		{
			int l =sc.nextInt();
			int h = sc.nextInt();
			int w =sc.nextInt();
			String res ="bad";
			if(l<=20 && h<=20 && w <=20)
			{
				res= "good";
			}
			System.out.printf("Case %d: %s\n",c,res);
			c++;
		}
		sc.close();
	}
}
