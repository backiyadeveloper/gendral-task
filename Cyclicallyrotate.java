import java.util.Arrays;
class Cyclicallyrotate{
public static void main(String [] args){
int arr[]={4,6,7,2,7};
int arr1[]=new int[1];
arr1[0]=arr[0];
//System.out.println(arr.length);
//System.out.println(arr[0]);
//System.out.println(arr1[0]);
arr[0]=arr[arr.length-1];
arr[arr.length-1]=arr1[0];
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}
}