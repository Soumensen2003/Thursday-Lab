import java.util.Scanner;
public class Palindrome
{
public static void main(String[] args)
{
int num1,num,sum=0;
System.out.println("Enter the number: ");
 Scanner sc=new Scanner(System.in);
 num=sc.nextInt();
 num1=num;
while(num!=0)
{
int r=num%10;
sum=(sum*10)+r;
num=num/10;
}
if (num1==sum)
{
System.out.println(num1+ " is palindrome");
}
else{
System.out.println(num1+ " is not palindrome");
}
}
}