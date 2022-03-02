import java.util.*;
class Pretty
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();
        for(int i=0;i<t;i++)
        {
            int l=obj.nextInt();
            int r=obj.nextInt();
            int c=0;
            for(int j=l;j<=r;j++)
            {
                if(j%10==2||j%10==3||j%10==9)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}