import Uebungen.Cat;
import Uebungen.Dog;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Dog dog1 =new Dog();
        dog1.schlafen();
        dog1.setName("Jimmy");
        dog1.setAlter(6);
        dog1.bellen();
        System.out.print(dog1.getName()+", "+dog1.getAlter());
        System.out.println();
        System.out.println();

        Cat cat1 =  new Cat();
        cat1.schlafen();
        cat1.setName("Mauzi");
        cat1.setAlter(8);
        cat1.schnurren();

        System.out.print(cat1.getName()+", "+cat1.getAlter());


    }
}