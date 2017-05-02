import java.util.HashMap;
import java.util.Scanner;

public class UVA_11616 {

	public static void main(String[] args) {
		String [] romans ={"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
		int [] arabic ={1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
		HashMap<String, Integer> map =new HashMap<>();
		for(int i=0;i<romans.length;i++){
			map.put(romans[i], arabic[i]);
		}
		
		HashMap<Integer, String> map2 =new HashMap<>();
		for(int i=0;i<romans.length;i++){
			map2.put(arabic[i], romans[i]);
		}
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String line = sc.nextLine();
			if(line == null || line.isEmpty())
			{
				break;
			}
			if(Character.isDigit(line.charAt(0)))
			{
				int num = Integer.parseInt(line);
				String res= "";
				int ind =12;
				while(num>0)
				{
					for(; arabic[ind]>num;ind--);
					num = num -arabic[ind];
					res += romans[ind];
					
				}
				System.out.println(res);
			}
			else
			{
				int res =0;
				for(int i=0;i<line.length();i++){
					String x = "";
					if(i<line.length()-1)
					{
						x = line.substring(i, i+2);
						
					}
					if(map.containsKey(x))
					{
						res+=map.get(x);
						i++;
					}
					else
					{
						x =line.substring(i,i+1);
						res+=map.get(x);
						
					}
				}
				System.out.println(res);
			}
		}
		sc.close();

	}

}
