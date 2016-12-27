import java.util.ArrayList;
import java.util.Scanner;
 
/**
 * Replace Class name by Main while submitting
 * @author johir
 *
 */
public class UVA272 {
    static boolean opened = false;
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> sol = new ArrayList<String>();
        while (in.hasNext()) {
            sol.add(convert(in.nextLine()));
        }
        for (String s : sol)
            System.out.println(s);
    }
 
    private static String convert(String nextLine) {
 
        StringBuffer buf = new StringBuffer();
        for (char c : nextLine.toCharArray()) {
            if (c == '\"') {
                if (opened)
                    buf.append("''");
                else
                    buf.append("``");
 
                opened = !opened;
            }
            else
                buf.append(c);
 
        }
        return buf.toString();
    }
}
