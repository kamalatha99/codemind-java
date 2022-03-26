import java.util.*;
class Win
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
        int x=0;int y=0;
        for(int i=0;i<n;i++)
        {
            if(i%2!=0)
            {
                x=x+a[i];
            }
            else
            {
                y=y+a[i];
            }
        }
        int diff=Math.abs(x-y);
        if(diff%4==0)
        {
        System.out.println("X");
        }
        else
        {
            System.out.println("Y");
        }
    }
}