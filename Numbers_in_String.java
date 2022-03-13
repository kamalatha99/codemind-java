import java.util.*;
class Stringnum
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                int t=Character.getNumericValue(ch);
                sum=sum+t;
            }
        }
        System.out.println(sum);
    }
}