import java.util.Scanner;
public class Factorial
{
public static void main(String[] args)
{
int i,num,c=1;
System.out.println("Enter the number: ");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
for(i=1;i<=num;i++)
{
c=c*i;
}
System.out.println("Factorial of "+num + " is " +c);
}
}