package phase2;
import java.util.*;
public class MatrixAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
        int m=obj.nextInt();
        int n=obj.nextInt();
        int[][] a=new int[m][n];
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum=sum+a[i][j];
               // System.out.print(a[i][j]+" ");
            }
           // System.out.println();
        }
        System.out.println(sum);
	}

}
