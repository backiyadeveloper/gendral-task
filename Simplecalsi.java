import java.util.Scanner;
class Simplecalsi{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a first number: ");
int num1=sc.nextInt();
System.out.println("Enter a second number: ");
int num2=sc.nextInt();
System.out.println("choice:");
System.out.println("+");
System.out.println("-");
System.out.println("*");
System.out.println("/");
System.out.println("%");
System.out.println("Enter your option");
String opt=sc.next();
switch (opt){
case "+":
	System.out.println(num1+"+"+num2+"="+ (num1+num2));
	break;
case "-":
	System.out.println(num1+"-"+num2+"="+ (num1-num2));
	break;
case "*":
	System.out.println(num1+"*"+num2+"="+ (num1*num2));
	break;
case "/":
	System.out.println(num1+"/"+num2+"="+ (num1/num2));
	break;
case "%":
	System.out.println(num1+"%"+num2+"="+(num1%num2));
	break;
}
}
}