import java.util.*;
class Triplet
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        int alice=0;
        int bob=0;
        for(int i=0;i<3;i++)
        {
            a[i]=obj.nextInt();
        }
        for(int j=0;j<3;j++)
        {
            b[j]=obj.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            {
                alice++;
            }
            else if(a[i]<b[i])
            {
                bob++;
            }
            else
            {
                
            }
        }
        System.out.println(alice+" "+bob);
    }
}