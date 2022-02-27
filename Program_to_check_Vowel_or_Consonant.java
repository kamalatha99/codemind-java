import java.util.*;
class Check
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        char c=obj.next().charAt(0);
        char ch=Character.toLowerCase(c);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}