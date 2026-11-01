public class Methods{
    //method without parameter
    static void myMethod(){

        System.out.println("I know what i am doing");
    }
    //Method with parameter
    static String  myName(String fname){
        System.out.println("My name is " + fname);
        return  fname;
    }
    //method more then one parameter
    static void fullName(String fname, String lname,  int age){
        System.out.println("My fullname is: " + fname + " " + lname + " and i am " + age + " years old.");
    }
    //method with parameters and return
    static int sum(int x ){
        return  x + 5;
    }

    static  int doubleAt(int x){
        return  x * 2;

    }

    public static void main(String[] args){
        myMethod();
        System.out.println(myName("Dali"));
        fullName("DaliM", "Melikidze", 31);

        for (int i = 0; i < 10; i++) {
            System.out.println(i+1 + "= " + sum(i));
        }
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " * 2 = " + doubleAt(i));
        }
    }




}
