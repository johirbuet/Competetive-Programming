import java.util.Scanner;

public class UVA_11150 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String line =sc.nextLine();
			if(line == null || line.isEmpty())
			{
				break;
			}
			int n =Integer.parseInt(line);
			int res = getNum(n)+n;
			System.out.println(res);
			
		}
	}
	
	public static int getNum(int n)
	{
		if(n==2)
		{
			return 1;
		}
		else if(n <=1)
		{
			return 0;
		}
		return getNum(n/3+n%3)+ n/3;
	}
}
