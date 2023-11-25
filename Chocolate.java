class  Candy{
Candy(){
System.out.println("candy class");
}
void tast(){
System.out.println("tastes sweet!");
}
//overload-
void greet(){
System.out.println("hello");
}
String greet(String name){
return "hello "+name;
}
}
class Chocolate extends Candy{
Chocolate(){
System.out.println("Chocolate class");
super.greet();
}
//upcasting only acces in parentclass properties
//void man(){
//System.out.println("subclass method");
//}
//overrride
void tast(){
System.out.println("tastes chocolately");
super.tast();
}
public static void main(String [] args){
Candy obj=new Chocolate();
obj.tast();
obj.greet();
//obj.man();
System.out.println(obj.greet("Sansha"));

}
}