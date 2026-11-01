public class loops {

public static void main(String[] args){
    //define array
    String [] cars = {"Tesla", "Volvo", "Ford", "BYD"};
    //modified array
    cars[0] = "Audi";

    for (int i = 0; i < cars.length; i++){
       // if (cars[i] == "Ford"){ break;}
        System.out.println(i+1 + ". " + cars[i]);
    }
    int [] Zahlen = {1,2,3,4,5,6,7,8,9};
    //for each loop
    for (int zahl : Zahlen){
        System.out.println(zahl * 2);

    }


}


}
