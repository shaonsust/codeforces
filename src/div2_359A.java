import java.util.Scanner;

public class div2_359A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n, k, val, x = 0, temp = 0;
        char ch;

        n = sc.nextInt();
        k = sc.nextInt();
        temp = k;
        for(int i = 0; i < n; i++)
        {
            ch = sc.next().charAt(0);
            val = sc.nextInt();
            if(ch == '+') temp  = temp + val;
            else
            {
                if(temp < val) x++;
                else temp = temp - val;
            }
        }
        System.out.println(temp + " " + x);
    }
}
