package phase2;
import java.util.*;
public class ContainDigitCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
        String s=obj.next();
        int c=0;
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                c++;
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Doesn't contain digit");
        }
        else
        {
            System.out.println("Contains"+" "+c+" "+"digit");
        }
	}

}
