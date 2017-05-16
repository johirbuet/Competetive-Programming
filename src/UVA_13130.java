import java.util.Scanner;

public class UVA_13130 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		for(int t =0;t<T;t++){
			boolean ok =true;
			int [] a =new int[5];
			for(int i=0;i<5;i++){
				a[i] =sc.nextInt();
			}
			
			for(int i= 1;i<5;i++){
				if(a[i]!=a[i-1]+1)
				{
					ok =false;
					break;
				}
			}
			System.out.println(ok?"Y":"N");
		}
		sc.close();
	}
}
