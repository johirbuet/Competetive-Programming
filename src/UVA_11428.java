import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class UVA_11428 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc =new Scanner(System.in);
		System.setOut(new PrintStream(new File("output.txt")));
		while(sc.hasNextInt())
		{
			int n= sc.nextInt();
			if(n<=0)
			{
				break;
			}
			long max = (long)Math.sqrt(n);
			boolean found =false;
			for(int i=1;i<=max;i++)
			{
				for(int j=i+1;j<=max;j++)
				{
					long p = (long) (Math.pow(j,3) - Math.pow(i, 3));
					if(p == n)
					{
						System.out.println(j+ " "+i);
						found = true;
						break;
					}
				}
				if(found)
				{
					break;
				}
			}
			if(!found)
			{
				System.out.println("No solution");
			}
		}
		sc.close();
	}

}
