import java.util.HashMap;
import java.util.Scanner;

public class UVA_10924 {
	public static void main(String[] args) {
		HashMap<Character, Integer> map =new HashMap<>();
		int i =1;
		for(char a ='a';a<='z';a++){
			map.put(a, i++);
		}
		for(char a ='A';a<='Z';a++){
			map.put(a, i++);
		}
		Scanner sc =new Scanner(System.in);
		while(sc.hasNextLine()){
			String line =sc.nextLine();
			if(line == null || line.isEmpty()){
				break;
			}
			int sum =0;
			char [] chs =line.toCharArray();
			for (char c : chs) {
				sum =sum +map.get(c);
			}
			if(isPrime(sum)){
				System.out.println("It is a prime word.");
			}
			else
			{
				System.out.println("It is not a prime word.");
			}
			
		}
		sc.close();
	}
	public static boolean isPrime(int n){
		if(n==2){
			return true;
		}
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
