import java.util.*;
class multiplicationTable{
public static void main(String[] args)
{
//int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int num=sc.nextInt();
//Syatem.out.println("multiplication Table of"+num);
for(int i=1;i<=10;i++)
{
//System.out.println("2x"+i+"="+(2*i));
System.out.println(num+"x"+i+"="+(num*i));
}
//sc.close();
}
}
