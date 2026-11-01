

import org.apache.commons.lang3.StringUtils;

public class MyClass {
    String name;
    int age;

    void print(){
        System.out.println("name: " + " " + name);
        System.out.println("age: " + " " + age);
    }

    /**
     * this print() method prints class variables
     * println() method prints output and new line
     */


        public static void main(String[] args){
            System.out.println("Hello maven!");
            String a = "Home is Home";
           String bb =  StringUtils.abbreviate(a,5);
            System.out.println(bb);

            MyClass person = new MyClass();
            person.name = "Dali";
            person.age = 31;
            person.print();



        }
    }

