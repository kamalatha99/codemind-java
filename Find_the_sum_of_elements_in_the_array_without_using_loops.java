import java.util.*;
class SumArrNOLOOP
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
        int i=0;
        int sum=0;
        while(true)
        {
            sum=sum+a[i];
            i++;
            if(i<n)
            {
                continue;
            }
            else
            {
                break;
            }
        }
        System.out.println(sum);
    }
}