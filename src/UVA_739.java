import java.util.Scanner;

public class UVA_739 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("         NAME                     SOUNDEX CODE");
		String s ="01230120022455012623010202";
		char [] c =s.toCharArray();
		while(sc.hasNextLine()){
			String name =sc.nextLine();
			if(name == null || name.isEmpty())
			{
				break;
			}
			System.out.printf("         %-25s",name);
			String res = name.charAt(0)+"";
			int added = 0;
			for(int i=1;i<name.length();i++){
				if(name.charAt(i)!= name.charAt(i-1) && c[name.charAt(i)-'A']!='0' && added<3)
				{
					res+=c[name.charAt(i)-'A'];
					added++;
				}
			}
			for(int i=added;i<3;i++){
				res =res +"0";
			}
			System.out.println(res);
		}
		System.out.println("                   END OF OUTPUT");
		sc.close();
	}
}
