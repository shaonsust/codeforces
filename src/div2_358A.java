import java.util.*;
public class div2_358A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n, m, mx, mn, ans = 0;

        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            ans = ans + ((i + m) / 5) - (i / 5);
        }
        System.out.println(ans);
    }
}
