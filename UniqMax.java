package phase2;
import java.util.*;
public class UniqMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int flag=0;
        int[] a=new int[n];
        int[] f=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            f[i]=c;
        }
        for(int i=n-1;i>=0;i--)
        {
            if(f[i]==1)
            {
                System.out.println(a[i]);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println(-1);
        }
	}

}
