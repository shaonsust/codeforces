import java.util.*;
public class educational_round_13_A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, k, ans;
        n = sc.nextInt();
        k = sc.nextInt();

        if(n % k == 0) ans = n+k;
        else
        {
            ans = n + (k - (n % k));
        }
        System.out.println(ans);
    }
}
