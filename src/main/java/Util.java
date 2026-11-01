import java.util.Scanner;


public class Util {
    public  static void main(String[] args){
        //create object
        Scanner myName = new Scanner(System.in);
        Scanner  age = new Scanner(System.in);

        System.out.println("Bitte geben Ihr Name ein: ");
        String username = myName.nextLine();
        System.out.println("Bitte geben Ihr Alter ein: ");
        int myAge = age.nextInt();
        System.out.println("Your name is: " + username + " and you are " + myAge + " years old.");
    }
}
