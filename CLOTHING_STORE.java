import java.util.*;
class Pair
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j] && a[i]!=0)
                {
                    c++;
                    a[j]=0;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}