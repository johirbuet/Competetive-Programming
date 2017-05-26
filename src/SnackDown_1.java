import java.util.Scanner;
import java.util.Stack;

public class SnackDown_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =Integer.parseInt(sc.nextLine());
		while(T-->0){
			int L = Integer.parseInt(sc.nextLine());
			String line = sc.nextLine();
			char [] carr = line.toCharArray();
			Stack<Character> stack =new Stack<>();
			for (char c : carr) {
				if(!stack.isEmpty() && c=='T' && stack.peek()=='H'){
					stack.pop();
				}
				else if(c == 'H' && !stack.isEmpty())
				{
					stack.push('H');
					break;
					
				}
				else if(c!='.'){
					stack.push(c);
				}
				
			}
			
			if(stack.isEmpty()){
				System.out.println("Valid");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
		sc.close();
	}
}
