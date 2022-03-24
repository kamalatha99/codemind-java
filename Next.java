package phase2;
import java.util.*;
public class Next {
	static Boolean isprime(int num)
	{
		if(num==0 ||num==1)
		{
			return false;
		}
		if(num==2||num==3)
		{
			return true;
		}
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	static Boolean ispalin(int num)
	{
		int o=num;
		int rev=0;
		while(num!=0)
		{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(o==rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		n=n+1;
		for(int i=n;i>=n;i++)
		{
			if(ispalin(i)==true && isprime(i)==true)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
