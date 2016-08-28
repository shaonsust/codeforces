import java.util.Scanner;

public class div2_aim_tech_3C
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        int begin = 0, flag = 0;

        str = sc.next();
        char[] ans = str.toCharArray();

        for(int i = 0; i < str.length(); i++)
        {
            if(ans[i] == 'a' && flag == 1) break;
            else if(ans[i] == 'a' && flag == 0 && i != (str.length() - 1))continue;
            else if(ans[i] == 'a' && flag == 0 && i == (str.length() - 1))
            {
                ans[i] = 'z';
            }
            else
            {
                ans[i] = (char)(ans[i] - 1);
                flag = 1;
            }
        }

        System.out.println(ans);
    }
}
