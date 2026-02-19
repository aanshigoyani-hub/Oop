import java.util.*;
public class pr1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n100,n50,n10,n5,n2,n1;
System.out.println("enter amount");
int a=sc.nextInt();
if(a<0)
{
System.out.println("invalid");
}
else
{
if(a>100)
{
n100=a/100;
a=a%100;
System.out.println("100 notes"+n100);
}
if(a>50)
{
n50=a/50;
a=a%50;
System.out.println("50 notes"+n50);
}
if(a>10)
{
n10=a/10;
a=a%10;
System.out.println("10 notes"+n10);
}
if(a>5)
{
n5=a/5;
a=a%5;
System.out.println("5 notes"+n5);
}
if(a>2)
{
n2=a/2;
a=a%2;
System.out.println("2 notes"+n2);
}
if(a>1)
{
n1=a/1;
a=a%1;
System.out.println("1 notes"+n1);
}
}
}
}
