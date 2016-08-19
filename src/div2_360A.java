import java.util.*;
public class div2_360A
{
    public static void main(String args[])
    {
        String str;
        char ch;
        int n, d, ans = -1, flag = 0;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        d = sc.nextInt();
        for (int i = 0; i < d; i++)
        {
            str = sc.next();
            if((str.indexOf('0')) >= 0) flag++;
            else
            {
                ans = Math.max(ans, flag);
                flag = 0;
            }
        }
        ans = Math.max(ans, flag);
        System.out.println(ans);
    }
}
