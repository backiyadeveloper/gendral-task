abstract class Animal{
    Animal(){
        System.out.println("Animal");
    }
 abstract public void speak();
 abstract public void eat();
}
class Dog extends Animal{
 public void speak(){
    System.out.println("woof");
 }
 public void eat(){
    System.out.println("numnum");
 }
}
class Woof{
    public static void main(String [] args){
    Dog d=new Dog();
    d.speak();
    d.eat();
    }
}
