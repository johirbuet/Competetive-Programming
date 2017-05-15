import java.util.Scanner;
import java.util.TreeSet;

public class UVA_10815 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		TreeSet<String> set =new TreeSet<>();
		while(sc.hasNextLine()){
			String s =sc.nextLine().toLowerCase();
			if(s.equals("0")){
				break;
			}
			s =s.replaceAll("[^a-z]", " ");
			String [] str =s.split("\\s+");
			
			
			for (String string : str) {
				set.add(string);
			}
		}
		sc.close();
		
		for (String string : set) {
			System.out.println(string);
			
		}
	}
}
