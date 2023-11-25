import java.util.Scanner;
class Converthosec{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a sec");
int sec=sc.nextInt();
int hour=sec/3600;
int min=sec/60;
System.out.println(hour);
System.out.println(min);
}
}