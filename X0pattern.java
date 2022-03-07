package phase2;
import java.util.*;
public class X0pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j){
				System.out.print("x");}
				else{
				System.out.print("0");
				}
			}
			System.out.println(" ");
			
		}

	}

}
