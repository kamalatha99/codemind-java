import java.util.*;
class Spe_rev
{
    static void rev(String s)
    {
        int i=0;
        int j=s.length()-1;
        char[] a=s.toCharArray();
        while(i<j)
        {
            if(Character.isLetter(a[i])==false)
            {
                i++;
                continue;
            }
            if(Character.isLetter(a[j])==false)
            {
                j--;
                continue;
            }
            char c=a[i];
            a[i]=a[j];
            a[j]=c;
            i++;
            j--;
        }
        s=String.valueOf(a);
        System.out.println(s);
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        rev(s);
    }
}