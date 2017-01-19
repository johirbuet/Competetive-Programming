import java.util.Scanner;

public class UVA1585 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			char [] arr=s.toCharArray();
			int value=1;
			int score=0;
			for (char c : arr) {
				if(c=='X')
				{
					value=1;
				}
				else
				{
					score+=value;
					value++;
				}
			}
			System.out.println(score);
		}
		sc.close();
	}
}
