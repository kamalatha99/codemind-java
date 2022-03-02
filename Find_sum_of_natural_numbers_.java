import java.util.*;
class Natural
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int res=a*(a+1);
        System.out.println(res/2);
    }
}