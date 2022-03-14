import java.util.*;
class Movezeros
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        Integer[] a=new Integer[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=0)
            {
                a[c++]=a[i];
            }
        }
        for(int i=c;i<n;i++)
        {
            a[i]=0;
        }
        for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");}
        
    }
}