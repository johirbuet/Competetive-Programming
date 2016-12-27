 
import java.util.Scanner;
import java.io.PrintWriter;
 
public class UVA11498
{
     public static void main(String[] args)
     {
          Scanner input = new Scanner(System.in);
          PrintWriter out = new PrintWriter(System.out);
 
          int cases = 0;
 
          do
          {
               cases = input.nextInt();
 
               if (cases == 0) break;
 
               int N = input.nextInt();
               int M = input.nextInt();
 
               for (int i = 0; i < cases; i++)
               {
                    int X = input.nextInt();
                    int Y = input.nextInt();
 
                    if (X == N || Y == M)
                         out.println("divisa");
                    else if (X > N && Y > M)
                         out.println("NE");
                    else if (X < N && Y > M)
                         out.println("NO");
                    else if (X < N && Y < M)
                         out.println("SO");
                    else
                         out.println("SE");
               }
 
          } while (cases != 0);
 
          out.close();
     }
}