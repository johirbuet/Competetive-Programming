import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class UVA_499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String line =sc.nextLine();
			if(line ==null || line.isEmpty())
			{
				break;
			}
			char [] cr =line.toCharArray();
			TreeMap<Character, Integer> map =new TreeMap<>();
			int max =0;
			for(char c : cr)
			{
				if((c<='z' && c>='a') || (c<='Z' && c>='A'))
				{
					if(map.containsKey(c))
					{
					map.put(c, map.get(c)+1);	
					if(map.get(c)>max)
					{
						max =map.get(c);
					}
					
					}
					else
					{
						map.put(c, 1);
						if(map.get(c)>max)
						{
							max =map.get(c);
						}
					}
				}
				
			}
			
			ArrayList<Character> list =new ArrayList<>();
			for(char c: map.keySet())
			{
				if(max == map.get(c))
				{
					if(!list.contains(new Character(c)))
					{
						list.add(new Character(c));
					}
					
				}
				
			}
			
			Collections.sort(list);
			for(int i=0;i<list.size();i++)
			{
			System.out.print(list.get(i));	
			}
			System.out.println(" "+max);
		}
		sc.close();
	}

}
