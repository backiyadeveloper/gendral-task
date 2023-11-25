import java .util.Arrays;
class SearchKeyElements{
public static void main(String [] args){
int arr[]={4,3,2,1};
Arrays.sort(arr);
int find=2;
System.out.println("array srting");
for(int i=0;i< arr.length;i++){
System.out.println(arr[i]);
}
 int result=Arrays.binarySearch(arr,find);
System.out.println("binary search is: "+result);
}
}
