import java.util.*;
class Reverse_Vowel
{
    static boolean isvowel(char c)
    {
        if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
        {
            return true;
        }
         else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        int i=0;
        int j=s.length()-1;
        char[] a=s.toCharArray();
        while(i<j)
        {
            if(isvowel(a[i])==false)
            {
                i++;
                continue;
            }
            if(isvowel(a[j])==false)
            {
                j--;
                continue;
            }
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
       String str2=String.copyValueOf(a);
       System.out.println(str2);
    }
}