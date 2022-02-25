import java.util.*;
class Hand
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextInt();
        long c=a*(a-1)/2;
        System.out.println(c);
    }
}