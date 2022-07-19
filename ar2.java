//changes done...
//github...
import java.util.*;
class ar2
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[8];
System.out.println("enter the array");

for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("the arrays are");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}

Arrays.sort(a);
System.out.println("the sorted array is");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}

}
}







