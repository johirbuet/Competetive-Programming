import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA11462 {

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        while (true) {
            StringBuffer sb = new StringBuffer();
            int num = Integer.parseInt(sc.nextLine());
            if (num == 0) {
                break;
            }
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            for (int i = 0; i < num; i++) {
                if (i > 0) {
                    sb.append(" ");
                }
                sb.append(arr[i]);
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}