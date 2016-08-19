import java.util.Scanner;
public class div2_367B
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, q, x;
        int[] arr = new int[100005];

        n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            x = sc.nextInt();
            arr[x]++;
        }

        q = sc.nextInt();
        for(int i = 1; i <=100000; i++ )
        {
            arr[i] = arr[i] + arr[i-1];
        }

        for(int i = 0; i < q; i++)
        {
            x = sc.nextInt();
            if(x > 100000) System.out.println(arr[100000]);
            else System.out.println(arr[x]);
        }
    }
}
