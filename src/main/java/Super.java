public class Super {
    String name ;
    //Constructor
    public  Super(String name){
        this.name = name;
        System.out.println("Superclass Constructor is called");
    }
}
class Factory extends Super {
    private int buildingyear;
    public Factory(String name, int buildingyear) {
        super(name);
        this.buildingyear = buildingyear;
    }
    public int getYear() {return buildingyear;}
    public void setBuildingyear(int buildingyear) {this.buildingyear = buildingyear;}

}
class ForTesting{
    public  static void  main (String[] args){
        Factory factory1 = new Factory("Tesla Factory", 2000);
        System.out.println("This is " + factory1.name + " it was built in " + factory1.getYear());
    }
}
