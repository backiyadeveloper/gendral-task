import java.util.Scanner;
import java.util.*;
class Primnot{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number :");
int number=sc.nextInt();
int count=0;
for(int i=2;i<number;i++){
if(number%i==0){
System.out.println("it is not prime");
count++;
break;
}
}
if(count==0){
System.out.println("it is a prime number");
}
}
}