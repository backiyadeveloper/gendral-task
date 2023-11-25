class Privatevar{
    private String name;
    private String address;
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address=address;
    }
}
class Getter{
void showdetails(Privatevar p,String name,String address){
    p.setname(name);
     p.setaddress(address);
     System.out.println(p.getname());
      System.out.println(p.getaddress());
}
public static void main(String [] args){
    Privatevar p1=new Privatevar();
    Getter g=new Getter();
    g.showdetails(p1,"backiya","virudhunagar");
}
}