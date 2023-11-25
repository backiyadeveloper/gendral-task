import java.util.Scanner;
class Markofstud{
public static void main(String[] args){
double total=0;
double percentage;
Scanner sc=new Scanner(System.in);
System.out.print("Enter your first subject mark :");
double mark1=sc.nextInt();
System.out.println();
System.out.print("Enter your second subject mark :");
double mark2=sc.nextInt();
System.out.println();
System.out.print("Enter your third subject mark :");
double mark3=sc.nextInt();
System.out.println();
System.out.print("Enter your fourth subject mark :");
double mark4=sc.nextInt();
System.out.println();
System.out.print("Enter your fifth subject mark :");
double mark5=sc.nextInt();
System.out.println();
total=mark1+mark2+mark3+mark4+mark5;
System.out.println("Total mark is :"+total);
percentage=((total/500)*100);
int grade=(int)percentage;
System.out.println("your percentage is : "+percentage);
if(grade>=100 && grade>90){
        System.out.println("A grade");
	}
	else if(grade>=90 && grade>80){
        System.out.println("B grade");
	}
	else if(grade>=80 && grade>70){
        System.out.println("C grade");
	}
	else if(grade>=70 && grade>60){
        System.out.println("D grade");
	}
	else if(grade>=60 && grade>50){
        System.out.println("E grade");
	}
	else{
	System.out.println("F grade");
	
}

}
}