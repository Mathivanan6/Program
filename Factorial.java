import java.io.*;
import java.lang.*;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a==0)
		{
			System.out.println("1");
		}else{
		int f=1;
		for(int i=a;i>0;i--)
		{
			
			f=f*i;
		}
		System.out.println(f);
	}}

}