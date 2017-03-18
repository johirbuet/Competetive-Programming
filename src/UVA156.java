import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class UVA156 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,ArrayList<String>> map=new HashMap<>();
		while(sc.hasNext())
		{
			String line=sc.next();
			if(line.equals("#"))
			{
				break;
			}
			String ll=line.toLowerCase();
			char [] chars=ll.toCharArray();
			Arrays.sort(chars);
			String sorted= new String(chars);
			
			if(map.containsKey(sorted))
			{
				ArrayList<String> ls=map.get(sorted);
				ls.add(line);
				map.put(sorted,ls);
			}
			else
			{
				ArrayList<String> ls=new ArrayList<String>();
				ls.add(line);
				map.put(sorted,ls);
			}
		}
		ArrayList<String> list=new ArrayList<>();
		for (String string : map.keySet()) {
			if(map.get(string).size()==1)
			{
				list.add(map.get(string).get(0));
			}
		}
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		sc.close();
	}
}
