import java.util.*;
class Area
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        Double r=obj.nextDouble();
        Double area=3.14*r*r;
        System.out.println(String.format("%.2f",area));
    }
}