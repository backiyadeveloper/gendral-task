import java.util.Scanner;
class Fibonacciseries{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("enter a number :");
int n=sc.nextInt();
int num1=0,num2=1;
System.out.println(num1);
System.out.println(num2);
int sum=0;
for(int i=2;i<n;i++){
sum=num1+num2;
num1=num2;
num2=sum;
System.out.println(sum);
}
}
}