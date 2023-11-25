import java.util.Arrays;
class Arraysortdisen{
public static void main(String [] args){
int arr[]={4,3,2,1};
System.out.println("Before sorting");
for(int i=0;i< arr.length;i++){
System.out.println(arr[i]);
}
Arrays.sort(arr);
System.out.println("After sorting");
for(int i=arr.length-1;i>=0;i--){
System.out.println(arr[i]);
}
   
}
}