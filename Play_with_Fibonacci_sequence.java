import java.util.*;
class Fibbo
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a=0;int b=1;
        int t;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++)
        {
            t=a+b;
            a=b;
            b=t;
            System.out.print(t+" ");
        }
    }
}