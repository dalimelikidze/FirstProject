abstract class Abstract {
    //create abstract method
    public abstract void makeSound();
}

 class Cat extends Abstract {
     @Override
     public void makeSound() {
         System.out.println("mew mew mew mew");
     }
 }
 class Dog extends Abstract {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");

    }
 }
 class Monkey extends Abstract {
    @Override
     public void makeSound() {
        System.out.println("ME ME ME ME");
    }
 }
 class Test {
    public static void main(String[] args){
        //create objects
        Abstract [] myAnimals = {new Cat(), new Dog(), new Monkey()};
        for (Abstract a : myAnimals){
            a.makeSound();
        }
    }
 }