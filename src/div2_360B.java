import java.util.*;
public class div2_360B
{
    public static void main(String args[])
    {
        String n, str;
        Scanner sc = new Scanner(System.in);

        n = sc.next();
        str = new StringBuffer(n).reverse().toString();
        System.out.println(n + str);
    }
}
