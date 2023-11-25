import java.util.Scanner;
class Tables{
public  static void main(String[]args){
Scanner scc=new Scanner(System.in);
int number=scc.nextInt();
for(int i=1;i<=10;i++){
System.out.println(i+ "*" +number+ "="+ i*number);
}
}
}