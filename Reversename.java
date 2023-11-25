import java.util.*;
class Reversename{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name: ");
String name=sc.nextLine();
int n=name.length();
System.out.println("length is"+n);
for(int i=n-1;i>=0;i--){
System.out.println(name.charAt(i));
}
}
}