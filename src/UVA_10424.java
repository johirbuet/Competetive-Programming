import java.util.HashMap;
import java.util.Scanner;

public class UVA_10424 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		HashMap<Character, Integer> map =new HashMap<>();
		int i =1;
		for(char a ='a';a<='z';a++){
			map.put(a, i++);
		}
		while(sc.hasNextLine()){
			String name1 =sc.nextLine().toLowerCase();
			String name2=sc.nextLine().toLowerCase();
			int num1 = 0;
			int num2 =0;
			for (char c : name1.toCharArray()) {
				if(c<='z' && c>='a'){
					num1+=map.get(c);
				}
			}
			for (char c : name2.toCharArray()) {
				if(c<='z' && c>='a'){
					num2+=map.get(c);
				}
			}
			String a = String.valueOf(num1);
			String b = String.valueOf(num2);
			
			while(a.length()>1)
			{
				num1 =0;
				for(int j=0;j<a.length();j++){
					num1 = num1 + Integer.parseInt(a.charAt(j)+"");
				}
				a = String.valueOf(num1);
			}
			
			while(b.length()>1)
			{
				num2 =0;
				for(int j=0;j<b.length();j++){
					num2 = num2 + Integer.parseInt(b.charAt(j)+"");
				}
				b = String.valueOf(num2);
			}
			double r = (num1==0 && num2==0)?0 : (100* ((double) Math.min(num1, num2) )/ ((double) Math.max(num1, num2)));
			if((num1==0 && num2==0)){
				System.out.println();
			}
			else
			{
				System.out.printf("%.2f %%\n",r);
			}
		}
		sc.close();
	}
}
