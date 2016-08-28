import java.util.Scanner;

public class div2_aim_tech_3A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, b, d, x, temp = 0, ans = 0;

        n = sc.nextInt();
        b = sc.nextInt();
        d = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            x = sc.nextInt();
            if(x > b) continue;

            if((x + temp) > d)
            {
                ans++;
                temp = 0;
            }
            else temp = temp + x;
        }

//        if(temp > d) ans++;
        System.out.println(ans);
    }
}
