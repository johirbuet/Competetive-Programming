import java.util.Scanner;

public class UVA_621 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =Integer.parseInt(sc.nextLine());
		for(int t=0;t<T;t++){
			String line =sc.nextLine();
			if(line.equals("1") || line.equals("4") || line.equals("78")){
				System.out.println("+");
			}
			else if(line.substring(line.length()-2).equals("35")){
				System.out.println("-");
			}
			else if(line.charAt(0)=='9' && line.charAt(line.length()-1)=='4'){
				System.out.println("*");
			}
			else
			{
				System.out.println("?");
			}
		}
		sc.close();
	}
}
