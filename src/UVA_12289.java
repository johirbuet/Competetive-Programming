import java.util.Scanner;

public class UVA_12289 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for(int i=0;i<T;i++)
		{
			String line = sc.nextLine();
			if(line.length()>3)
			{
				System.out.println(3);
			}
			else
			{
				if(line.charAt(0)=='o' && line.charAt(1)=='n' || line.charAt(0)=='o' && line.charAt(2)=='e'
						|| line.charAt(1)=='n' && line.charAt(2)=='e')
				{
					System.out.println(1);
				}
				else
				{
					System.out.println(2);
				}
					
			}
		}
		sc.close();
	}

}
