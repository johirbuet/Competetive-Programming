import java.util.HashMap;
import java.util.Scanner;

public class UVA102 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Character, Integer> chars=new HashMap<>();
		chars.put('B',0);
		chars.put('G',1);
		chars.put('C', 2);
		String [] combinations={"BCG","BGC","CBG","CGB","GBC","GCB"};
		while(sc.hasNext())
		{
			int [] glass = new int[9];
			for(int i=0;i<9;i++)
			{
				glass[i]=sc.nextInt();
			}
			int ans=Integer.MAX_VALUE;
			String anss="";
			for(int i=0;i<6;i++)
			{
				String s=combinations[i];
				char [] chrs =s.toCharArray();
				int ind=chars.get(chrs[0]);
				int val=glass[(ind+1)%3]+glass[(ind+2)%3];
				ind=chars.get(chrs[1]);
				val+= glass[(ind+4)%3+3]+glass[(ind+5)%3+3];
				ind=chars.get(chrs[2]);
				val+= glass[(ind+7)%3+6]+glass[(ind+8)%3+6];
				if(val<ans)
				{
					ans=val;
					anss=s;
				}
			}
			System.out.println(anss+" "+ans);
		}
		
		sc.close();
	}

}
