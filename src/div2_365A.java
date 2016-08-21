import java.util.*;
public class div2_365A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, x, y, mishka = 0, chris = 0;

        n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            x = sc.nextInt();
            y = sc.nextInt();

            if(x > y) mishka++;
            else if(y > x) chris++;
        }

        if(mishka > chris) System.out.println("Mishka");
        else if (chris > mishka) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}
