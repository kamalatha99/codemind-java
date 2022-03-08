package phase2;
import java.util.*;
public class AlphaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				sum=sum+Integer.parseInt(String.valueOf(ch));
			}
			
	}
		System.out.println(sum);
		
	}

}
