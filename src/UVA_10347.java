import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UVA_10347 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String m = "";
        while ((m = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(m);
            double m1 = Double.parseDouble(st.nextToken());
            double m2 = Double.parseDouble(st.nextToken());
            double m3 = Double.parseDouble(st.nextToken());
            double med = (m1 + m2 + m3) / 2.0;
            double area = (4 / 3.0) * Math.sqrt(med * (med - m1) * (med - m2) * (med - m3));
            if (!(area > 0)) {
                area = -1;
            }
            System.out.printf("%.3f\n", area);
        }
    }

}
