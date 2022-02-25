import java.util.*;
class Area
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        double a=obj.nextDouble();
        double b=obj.nextDouble();
        double avg=(a+b)/2;
        System.out.println(String.format("%.4f",avg));
    }
}