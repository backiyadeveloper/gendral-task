import java.util.Scanner;
class Product{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System .out.print("Enter a first number:");
int num=sc.nextInt();
System .out.print("Enter a second number:");
int num1=sc.nextInt();
int num2=num*num1;
System.out.println("product of two number is: " +num2);
}
}