import java.util.Scanner;

public class UVA_11878 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int count =0;
		while(sc.hasNextLine())
		{
			String line =sc.nextLine();
			if(line ==null || line.isEmpty())
			{
				break;
			}
			String [] lr = line.split("=");
			String [] lps = new String[2];
			boolean plus =false;
			if(lr[0].indexOf('+')!=-1)
			{
				lps = lr[0].split("\\+");
				plus =true;
			}
			else
			{
				lps = lr[0].split("\\-");
			}
			
			int lop =Integer.parseInt(lps[0]);
			int rop = Integer.parseInt(lps[1]);
			if(Character.isDigit(lr[1].charAt(0)) || lr[1].length() >1 && Character.isDigit(lr[1].charAt(1)))
			{
				int res= Integer.parseInt(lr[1]);
				if(plus){
					if(res == lop+rop){
						count++;
					}
				}
				else
				{
					if(res == lop -rop)
					{
						count++;
					}
				}
					
			}
		}
		System.out.println(count);
	}
}
