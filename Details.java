class Person{
String name;
int age;
String degree;
Person(String n,int a){
name=n;
age=a;
}
void showdetails(){

    System.out.println(name+","+age);
}
}


class Teacher extends Person{
    String degree;
Teacher(String n1,int a1,String d1){
super(n1,a1);
degree=d1;
//super(Person("Darma",30));
}
void show(){

    System.out.println(name+","+age+","+degree);
}
}
class Details{
public static void main(String [] args){
Person p=new Person("backiya",20);
Teacher  p1=new Teacher ("backiya",20,"BE");
p.showdetails();
p1.show();
}
}