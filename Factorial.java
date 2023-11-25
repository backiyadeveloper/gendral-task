import java.util.Scanner;
class Factorial{
public static void main(String [] atgs){
int fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number : ");
int num=sc.nextInt();
for(int i=1;i<=num;i++){
fact*=i;
}
System.out.println("factorial of "+num +" is :"+fact);
}
}