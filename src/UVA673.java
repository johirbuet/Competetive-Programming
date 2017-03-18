import java.util.Scanner;
import java.util.Stack;

public class UVA673 {
	public static void main(String[] args) {
		Stack<Character> stack=new Stack<>();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			String s=sc.nextLine();
			boolean yes=true;
			stack.clear();
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				if(c=='('||c=='{'||c=='['){
					stack.push(c);
				}
				else if(c==')')
				{
					if(stack.size()==0)
					{
						yes=false;
						break;
					}
					char b=stack.pop();
					if(b!='(')
					{
						yes=false;
						break;
					}
				}
				else if(c=='}')
				{
					if(stack.size()==0)
					{
						yes=false;
						break;
					}
					char b=stack.pop();
					if(b!='{')
					{
						yes=false;
						break;
					}
				}
				else if(c==']')
				{
					if(stack.size()==0)
					{
						yes=false;
						break;
					}
					char b=stack.pop();
					if(b!='[')
					{
						yes=false;
						break;
					}
				}
			}
			if(yes && stack.size()==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}
