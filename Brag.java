class Pet{
Pet(){
    System.out.println("pet");
}
void petsbrag(){
    System.out.println("I have the best pet!");
}
}
class Dog extends Pet{
void petsbrag(){
    super.petsbrag();
    System.out.println("I have the best dog");
    
}

}
class Brag{
 public static void main(String [] args){
    Dog d=new Dog();
    d.petsbrag();
 }
}