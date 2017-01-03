import java.util.Scanner;

public class UVA10018 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long num=sc.nextInt();
			int count =0;
			while(true)
			{
				String s=String.valueOf(num);
				String rev=(new StringBuilder(s)).reverse().toString();
				num=num+Long.parseLong(rev);
				count++;
				if(isPalindrome(num))
				{
					break;
				}
			}
			System.out.println(count+" "+num);
		}
		sc.close();
	}
	
	public static boolean isPalindrome(long number)
	{
		String s=String.valueOf(number);
		return (new StringBuilder(s)).reverse().toString().equals(s);
	}
}
