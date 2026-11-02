public interface InterFclass {
    //Methods in Interface are automatically correct
     void drive();
     void fly();
}
class CarFly implements  InterFclass {
    @Override public void  drive(){
        System.out.println("Car can drive but  be carful");
    }
    @Override public void fly(){
        System.out.println("Car can fly be careful");
    }
}
 class App {
    public static void main(String[] args) {
        InterFclass myFirstInterface = new CarFly();
        myFirstInterface.drive();
        myFirstInterface.fly();
    }
 }