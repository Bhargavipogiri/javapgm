import java.util.*;
class GradeCalculation{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter S1,S2,S3,S4,S5 values"); 
int S1,S2,S3,S4,S5;
S1=sc.nextInt();
S2=sc.nextInt();
S3=sc.nextInt();
S4=sc.nextInt();
S5=sc.nextInt();
float Avg;
Avg=(S1+S2+S3+S4+S5)/5;
if (Avg>90)
System.out.println("A grade");
else if(Avg>80)
System.out.println("B grade");
else if(Avg>70)
System.out.println("C grade");
else if(Avg>60)
System.out.println("D grade");
else 
System.out.println("F grade");
}
}