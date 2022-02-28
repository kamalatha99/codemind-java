import java.util.*;
class Grade
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if(a>50&&b>60&&c>100)
        {
            System.out.println(10);
        }
        else if(a>50&&b>60)
        {
            System.out.println(9);
        }
        else if(b>60&&c>100)
        {
            System.out.println(8);
        }
         else if(a>50&&c>100)
        {
            System.out.println(7);
        }
        else if(a<=50&&b<=60&&c<=100)
        {
            System.out.println(5);
        }
        else
        {
            System.out.println(6);
        }
    }
}