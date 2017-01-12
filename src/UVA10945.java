import java.util.Scanner;

public class UVA10945 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			String line=sc.nextLine();
			if(line.equals("DONE"))
			{
				break;
			}
			line=line.replaceAll("[^A-Za-z ]", "");
			line=line.replaceAll(" ", "");
			line=line.toLowerCase();
			StringBuilder sb=new StringBuilder(line);
			String rev=sb.reverse().toString();
			if(line.equals(rev))
			{
				System.out.println("You won't be eaten!");
			}
			else
			{
				System.out.println("Uh oh..");
			}
		}
	}

}
