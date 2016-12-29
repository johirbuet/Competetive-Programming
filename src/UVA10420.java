import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA10420 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> map=new HashMap<>();
		int n=sc.nextInt();
		sc.nextLine();
		while(n-->0)
		{
			String si=sc.nextLine();
			StringTokenizer st=new StringTokenizer(si);
			String s=st.nextToken();
			if(map.containsKey(s))
			{
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s, 1);
			}
		}
		ArrayList<String> list=new ArrayList<>();
		for(String s: map.keySet())
		{
			list.add(s+" "+map.get(s));
		}
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
	}

}
