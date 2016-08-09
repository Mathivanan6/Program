import java.io.*;
import java.lang.*;
import java.util.*;

class Rev
{
public static void main(String []args)
{

Scanner s=new Scanner(System.in);
String s1=s.next();
StringBuffer sb=new StringBuffer(s1);
sb.reverse();
String out=sb.toString();

System.out.println(out);


}

}