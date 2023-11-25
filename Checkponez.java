import java.util.Scanner;
class Checkponez{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number : ");
int number=sc.nextInt();
if(number==0){
System.out.println("number is zero");
}
else if(number>0){
System.out.println("positive number");
}
else{
System.out.println("negative number");
}
}
}