package phase2;
import java.util.*;
public class ContainsDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int f=0;
            String s=obj.next();
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                if(Character.isDigit(ch))
                {
                    f=1;
                }
            }
            if(f==0)
            {
                System.out.println("No");
            }
            else
            {
                System.out.println("Yes");
            }
        }
	}

}
