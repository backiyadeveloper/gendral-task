import java.util.Arrays;
class Uniqueelement{
public static void main(String [] args){
int arr[]={1,1,1,2,3,3,5,1};
int count=0;
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]==arr[j]){
count++;

}

}
if(count==0){
System.out.println(arr[i]);
}
count=0;

}
}
}