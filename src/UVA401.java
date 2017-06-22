import java.util.HashMap;
import java.util.Scanner;

public class UVA401 {

	public static HashMap<Character, Character> hm = new HashMap<Character, Character>();
	public static void main(String[] args) {
		hm.put('A', 'A');
        hm.put('E', '3');
        hm.put('H', 'H');
        hm.put('I', 'I');
        hm.put('J', 'L');
        hm.put('L', 'J');
        hm.put('M', 'M');
        hm.put('O', 'O');
        hm.put('S', '2');
        hm.put('T', 'T');
        hm.put('U', 'U');
        hm.put('V', 'V');
        hm.put('W', 'W');
        hm.put('X', 'X');
        hm.put('Y', 'Y');
        hm.put('Z', '5');
        hm.put('1', '1');
        hm.put('2', 'S');
        hm.put('3', 'E');
        hm.put('5', 'Z');
        hm.put('8', '8');
        Scanner sc =new Scanner(System.in);
        while(sc.hasNextLine()){
        	String w =sc.nextLine();
        	System.out.println(solve(w));
        	System.out.println();
        }
        sc.close();

	}
	
	public static String solve(String s){
		if(isMirroredPalindrome(s)){
			return s + " -- is a mirrored palindrome.";
		}
		if(isMirroredString(s)){
			return s + " -- is a mirrored string.";
		}
		if(isPalindrome(s)){
			return s + " -- is a regular palindrome.";
		}
		else
		{
			return s +" -- is not a palindrome.";
		}
	}
	public static boolean isMirroredPalindrome(String s){
		return isPalindrome(s) && isMirroredString(s);
	}
	public static boolean isPalindrome(String s){
		int l = 0;
		int r =s.length() -1;
		while(l < r){
			if(s.charAt(l++) != s.charAt(r--)){
				return false;
			}
		}
		return true;
	}
	public static boolean isMirroredString(String s){
		for(int i=s.length()-1;i>=s.length()/2;i--){
			if(!hm.containsKey(s.charAt(i)) || hm.get(s.charAt(i)) != s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	

}
