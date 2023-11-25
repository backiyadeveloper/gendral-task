import java.util.Scanner;
class Mulmod{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a first value :");
int num1=sc.nextInt();
System.out.print("Enter a second value :");
int num2=sc.nextInt();
int sum=num1+num2;
int sub=num1-num2;
int mul=num1*num2;
int div=num1/num2;
int mod=num1%num2;
System.out.println("Sum of two number is: "+sum);
System.out.println("subtraction of two number is: "+sub);
System.out.println("multiplication of two number is: "+mul);
System.out.println("divition of two number is: "+div);
System.out.println("Modulo of two number is: "+mod);
}
}