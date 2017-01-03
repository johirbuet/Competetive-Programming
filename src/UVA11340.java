
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class UVA11340 {


    static HashMap<Character , Long> hm;
    public static long compute (char [] arr)
    {
        long ans = 0;
        for(int i = 0 ; i < arr.length ; ++i)
            if(hm.containsKey(arr[i])) ans += hm.get(arr[i]);
        return ans ;
    }
    public static void main(String[]args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(sc.nextLine());
        while(T -- > 0)
        {
            hm = new HashMap<>();
            int K = Integer.parseInt(sc.nextLine());
            while(K --  >0)
            {
                StringTokenizer st = new StringTokenizer(sc.nextLine());
                hm.put(st.nextToken().charAt(0) , Long.parseLong(st.nextToken()));
            }
            int M = Integer.parseInt(sc.nextLine());
            long ans = 0;
            while(M -- >0) ans += (compute(sc.nextLine().toCharArray()));
            sb.append(new DecimalFormat("0.00").format( ans / 100.0) + "$\n");
        }
        out.print(sb.toString());
        out.flush();
        out.close();
    }
   

}