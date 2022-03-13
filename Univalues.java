package phase2;
import java.util.*;
public class Univalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj=new Scanner(System.in);
	        int n=obj.nextInt();
	        int[] a=new int[n];
	        int f=0;
	        for(int i=0;i<n;i++)
	        {
	            a[i]=obj.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	            int c=0;
	            for(int j=i+1;j<n;j++)
	            {
	                if(a[i]==a[j])
	                {
	                    c++;
	                    a[j]=-1;
	                }
	                
	            }
	        if(c==0 &&a[i]!=-1)
	        {
	                System.out.print(a[i]+" ");
	                f=1;
	        }
	        }
	        if(f==0)
	        {
	            System.out.println(-1);
	        }
	    }
	}

