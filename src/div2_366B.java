import java.util.Scanner;

public class div2_366B
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, even = 0, x;

        n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            x = sc.nextInt();
            if(x % 2 == 0) even++;
            if(even % 2 == 1) System.out.println("1");
            else System.out.println("2");
        }
    }
}
