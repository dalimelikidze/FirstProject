public class learningClass {
    //class variablen
    int modelYear;
    String carName;
    //create default constructor
    public learningClass(){
        modelYear = 2000;
        carName = "unbekannt";
    }
    //constructor with parameters
    public learningClass(int modelYear, String carName){
        this.modelYear = modelYear;
        this.carName = carName;
    }
    //create instance method
    public void fullSpeed(){
        System.out.println("The car is going as fast as it can");
    }
    //Methods to be called without static we need to create class object
    public void speed(int maxSpeed){
        System.out.println("Cars's max speed is: " + maxSpeed);

    }
    public void print(){
        System.out.println("Car name is: " + carName + " from " + modelYear);
    }
}
