import java.util.*;
class Heron
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        double a=obj.nextDouble();
        double b=obj.nextDouble();
        double c=obj.nextDouble();
        double s=(a+b+c)/2.0;
        double area=Math.sqrt(s*((s-a)*(s-b)*(s-c)));
        System.out.println(String.format("%.2f",area));
        
    }
}
