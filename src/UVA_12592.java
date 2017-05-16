import java.util.HashMap;
import java.util.Scanner;

public class UVA_12592 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		HashMap<String, String> map =new HashMap<>();
		int N =Integer.parseInt(sc.nextLine());
		for(int i=0;i<N;i++){
			String key =sc.nextLine();
			String val = sc.nextLine();
			map.put(key, val);
		}
		int T =Integer.parseInt(sc.nextLine());
		for(int i=0;i<T;i++){
			String key = sc.nextLine();
			System.out.println(map.get(key));
		}
		sc.close();
	}

}
