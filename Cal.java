package calc;
import java.util.Scanner;
public class Cal {
public static void main(String[] args) {
double num1;
double num2;
double ans;
char op;
Scanner reader=new Scanner(System.in);
System.out.println("Enter Two Numbers");
num1=reader.nextDouble();
num2=reader.nextDouble();
System.out.println("Enter An Oprators(+,-,*,/):");
op=reader.next().charAt(0);
switch(op)
{
case'+':ans=num1+num2;
break;
   case'-':ans=num1-num2;
   break;
   case'*':ans=num1*num2;
break;
   case'/':ans=num1/num2;
break;
default:System.out.println("Errpr! Enter Correct Operators");
return;
}
System.out.println("The Result Is Given As Follows:\n");
System.out.println(num1+" "+op+" "+num2+" ="+ans);
}
}