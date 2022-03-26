import java.util.*;
class Half_List
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
        int j=0;
        for(int i=n-1;i>=0;i--)
        {
            if(i>=n/2){
            System.out.print(a[i]+" ");}
            else
            {
                System.out.print(a[j]+" ");
                j++;
            }
            
        }
    }
}