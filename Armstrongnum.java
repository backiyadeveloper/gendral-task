import java.lang.Math;
class  Armstrongnum{
public static void main(String [] args){
for(int i=1;i<=600;i++){
	int num=i,count=0, s=0,n=0;
	while(num!=0){
         num=num/10;
	 count++;
	}
       int temp=i;
      while(temp!=0){
        n=temp%10;
	s+=(Math.pow(n,count));
	temp=temp/10;
	}
if(s==i){
System.out.println(s);
}
}
}
}