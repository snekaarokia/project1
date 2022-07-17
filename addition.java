
//push to repositry....

import java.util.Scanner;

class addition
{
public static void main(String[] args)
{
System.out.println("Enter a number");
int sum = 0;
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();

while (num >= 0) 
{
sum=sum+num;
}
System.out.println("Sum = " + sum);
}
}
