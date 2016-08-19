import java.util.*;
public class div2_367A
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double[] a = new double[1010];
        double[] b = new double[1010];
        double n, v, distance, time = 1000000000;

        a[0] = sc.nextDouble();
        b[0] = sc.nextDouble();
        n = sc.nextDouble();

        for(int i = 1; i <= n; i++)
        {
            a[i] = sc.nextDouble();
            b[i] = sc.nextDouble();
            v = sc.nextDouble();
            distance = Math.sqrt(Math.pow((a[0] - a[i]), 2) + Math.pow((b[0] - b[i]), 2));
            distance = distance / v;
            time = Math.min(distance, time);
        }

        System.out.println(time);
    }
}
