import java.io.*;
import java.lang.*;
import java.util.*;

public class RevInt {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int t=0;
		while(a>0)
		{
			t=(t*10)+a%10;
			a=a/10;
		}
	System.out.println(t);
	}

}