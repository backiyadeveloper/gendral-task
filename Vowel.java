import java.util.Scanner;
class Vowel{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a charecter :");
char value=sc.next().charAt(0);
System.out.println();
if(value=='a' || value=='e' ||value=='i' ||value=='o' ||value=='u' ){
System .out.println("it is vouel");
}
else{
System.out.println("it is not a vouel");
}
}
}