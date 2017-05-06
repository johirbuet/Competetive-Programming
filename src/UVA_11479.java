import java.util.Arrays;
import java.util.Scanner;

public class UVA_11479 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T =sc.nextInt();
		int cs =0;
		for(int t=0;t<T;t++){
			long a =sc.nextLong();
			long b =sc.nextLong();
			long c =sc.nextLong();
			cs++;
			long [] arr =new long[3];
			arr[0]=a;
			arr[1]=b;
			arr[2]=c;
			Arrays.sort(arr);
			if(arr[0]+arr[1] <= arr[2]){
				String res ="Invalid";
				System.out.printf("Case %d: %s\n",cs,res);
			}
			else if(arr[0]== arr[1] && arr[0]==arr[2])
			{
				String res="Equilateral";
				System.out.printf("Case %d: %s\n",cs,res);
			}
			else if(arr[0] == arr[1] || arr[1]==arr[2] || arr[2]==arr[0])
			{
				String res="Isosceles";
				System.out.printf("Case %d: %s\n",cs,res);
			}
			else
			{
				String res="Scalene";
				System.out.printf("Case %d: %s\n",cs,res);	
			}
		}
		sc.close();
	}
}
