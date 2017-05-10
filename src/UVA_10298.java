import java.util.HashMap;
import java.util.Scanner;

public class UVA_10298 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLine()){
			String line =sc.nextLine();
			if(line.equals(".")){
				break;
			}
			HashMap<Character, Boolean> map =new HashMap<>();
			int count = 0;
			for(int i=0;i<line.length();i++){
				char c = line.charAt(i);
				if(map.containsKey(c))
				{
					break;
				}
				else
				{
					map.put(c, true);
					count++;
				}
			}
			System.out.println(line.length()/count);
		}
		sc.close();
	}
}
