public class thisKeyword {
    //using this key word and constructors
    String modelName;
    int modelYear;


    //Construktor with one paramter
    public thisKeyword(String modelName){
        this(modelName,3030);
    }
    //Constructor with 2 arguments
    public thisKeyword(String modelName, int modelYear){
        this.modelName = modelName;
        this.modelYear = modelYear;
    }
    //create main method to call construktor
    public void print(){
        System.out.println("Name of this car is: " + modelName + " and it came out in " + modelYear + ".");
    }

    //main method
    public static void main(String[] args) {
        //create object
        thisKeyword car1 = new thisKeyword("Tesla");
        thisKeyword car2 = new thisKeyword("Tesla Flying car", 2029);
        System.out.println("###CAR 1###");
       car1.print();
        System.out.println("###CAR 2 ###");
        car2.print();


    }
}
