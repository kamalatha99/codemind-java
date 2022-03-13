import java.util.*;
class ArraySum
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int sum[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            b[j]=obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum[i]=a[i]+b[i];
            System.out.print(sum[i]+" ");
        }
    }
}