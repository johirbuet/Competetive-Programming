import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class UVA11349 {
 
public static void main(String[] args) throws IOException {
 // Scanner s = new Scanner(System.in);
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 StringTokenizer st;
 int n = Integer.parseInt(br.readLine());
 int count = 1;
 while (n-- > 0) {
 
st = new StringTokenizer(br.readLine());
 st.nextToken();
 st.nextToken();
 
 int l = Integer.parseInt(st.nextToken());
 
long[][] arr = new long[l][l];
 boolean flg = true;
 
for (int i = 0; i < l; i++){
 st=new StringTokenizer(br.readLine());
 for (int j = 0; j < l; j++) {
 arr[i][j] = Long.parseLong(st.nextToken());
 if (arr[i][j] < 0){
 flg = false;
 break;
 }
 }
 }
 if (flg) {
 int center = (int) Math.ceil(l / 2);
 
for (int i = 0; i <= center; i++) {
 for (int j = 0; j < l; j++) {
 int centerI = l - i - 1;
 int centerJ = l - j - 1;
 
if (arr[i][j] != arr[centerI][centerJ]) {
 flg = false;
 break;
 }
 }
 }
 }
 if (flg)
 System.out.println("Test #" + count++ + ": " + "Symmetric.");
 else
 System.out
 .println("Test #" + count++ + ": " + "Non-symmetric.");
 
}
 }
}