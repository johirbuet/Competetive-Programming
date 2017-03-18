import java.util.HashMap;
import java.util.Scanner;

public class UVA12250 {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<>();
		map.put("HELLO","ENGLISH");
		map.put("HOLA","SPANISH");
		map.put("HALLO","GERMAN");
		map.put("BONJOUR","FRENCH");
		map.put("CIAO","ITALIAN");
		map.put("ZDRAVSTVUJTE","RUSSIAN");
		Scanner sc=new Scanner(System.in);
		int c=1;
		while(sc.hasNext())
		{
			String s=sc.next();
			if(s.equals("#"))
			{
				break;
			}
			if(map.containsKey(s))
			{
				System.out.println("Case "+c+": "+map.get(s));
			}
			else
			{
				System.out.println("Case "+c+": UNKNOWN");
			}
			
			c++;
		}
		sc.close();
	}

}
