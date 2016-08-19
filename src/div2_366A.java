import java.util.Scanner;

/**
 * Created by optimus on 8/19/16.
 */
public class div2_366A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 != 0) System.out.print("I hate ");
            else System.out.print("I love ");
            if(i != n) System.out.print("that ");
        }
        System.out.print("it");
    }
}
