
//git...
//changes done...
import java.util.Scanner;
class array3
{
public static void main(String arg[])
{
Scanner sk=new Scanner(System.in);
System.out.println("Enter any word:");
String word=sk.nextLine();
System.out.println("the given string is:"+word);
int I=word.length();
System.out.println("enter the value to slice:");
int n=sk.nextInt();

String s1=word.substring(0,n);
String s2=word.substring(I-3,I);
String s3=String.valueOf(I)+s1+s2;
System.out.println(s3);
}
}
