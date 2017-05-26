import java.util.Arrays;
import java.util.Scanner;

public class UVA_1339 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLine()){
			String en =sc.nextLine();
			String msg =sc.nextLine();
			int [] arr1 = new int[26];
			int [] arr2= new int[26];
			for(int i=0;i<en.length();i++)
			{
				arr1[en.charAt(i)-'A']++;
				arr2[msg.charAt(i)-'A']++;
			}
			for(int i=0;i<26;i++){
				System.out.println(arr1[i]+" "+arr2[i]);
			}
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean no =false;
			for(int i=0;i<26;i++){
				if(arr1[i] != arr2[i])
				{
					no =true;
					System.out.println("NO");
					break;
				}
			}
			if(!no)
			{
				System.out.println("YES");
			}
		}
		sc.close();
	}
}
