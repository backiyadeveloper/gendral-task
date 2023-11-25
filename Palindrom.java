import java .util.Scanner;
class Palindrom{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number :");
int number=sc.nextInt();
int reverse=0,sum=0,temp=number;
for(;number>0;){
reverse =number%10;
sum=(sum*10)+reverse;
number=number/10;
}
System.out.println(sum);
if(sum==temp){
System.out.println("it is a palindrom");
}
else{
System.out.print("it is not a palindrom");
}
}
}