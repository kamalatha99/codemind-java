import java.util.*;
class Raindrop
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n%3==0)
        {
            System.out.print("Pling");
        }
        if(n%5==0)
        {
             System.out.print("Plang");
        }
        if(n%7==0)
        {
            System.out.print("Plong");
        }
        if(n%3!=0&&n%5!=0&&n%7!=0)
        {
             System.out.println(n);
        }
    }
}