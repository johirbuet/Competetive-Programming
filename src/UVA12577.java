import java.util.Scanner;

public class UVA12577 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=1;
		while(true)
		{
			String s=sc.next();
			if(s.equals("*"))
			{
				break;
			}
			if(s.equals("Hajj"))
			{
				System.out.println("Case "+c+": Hajj-e-Akbar");
			}
			else
			{
				System.out.println("Case "+c+": Hajj-e-Asghar");
			}
			c++;
		}
	}

}
