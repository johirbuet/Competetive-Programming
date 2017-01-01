import java.util.Scanner;

public class UVA10035 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			String a=sc.next();
			String b=sc.next();
			if(a.equals("0") && b.equals("0"))
			{
				break;
			}
			int lena=a.length();
			int lenb=b.length();
			if(lena<lenb)
			{
				for(int i=lena;i<lenb;i++)
				{
					a="0"+a;
				}
			}
			if(lena>lenb)
			{
				for(int i=lenb;i<lena;i++)
				{
					b="0"+b;
				}
			}
			int count=0;
			int carry=0;
			for(int i=a.length()-1;i>=0;i--)
			{
				int f=Integer.parseInt(a.charAt(i)+"");
				int s=Integer.parseInt(b.charAt(i)+"");
				int sum=f+s+carry;
				carry=sum/10;
				if(sum>=10)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("No carry operation.");
			}
			else if(count ==1)
			{
				System.out.println(count+" carry operation.");
			}
			else
			{
				System.out.println(count+" carry operations.");
			}
			
		}
		sc.close();
	}
}
