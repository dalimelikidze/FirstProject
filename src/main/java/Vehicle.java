public class Vehicle {
    protected String  brand = "Tesla";
    public void hook(){
        System.out.println("Pip pip");
    }
}

class Car extends Vehicle{
    private String carName = "Mustang";
    public static void main(String[] args){
        Car car1 = new Car();
        car1.hook();
        System.out.println("Car's name is: " + car1.carName + " and brand is:" + car1.brand);
    }
}