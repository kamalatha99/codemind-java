package phase2;
import java.util.*;
public class Slice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		StringBuffer s1=new StringBuffer(); 
		s1.append(obj.next());
		int start=obj.nextInt();
		int last=obj.nextInt();
		System.out.println(s1.substring(start,last));
		
	}

}
