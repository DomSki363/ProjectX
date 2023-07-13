package Uebungen;

public class Program_mit_aussenAufruf {
    public static void main(String[] args) {
  /*      KlasseCar car1 = new KlasseCar(); // Instanziierung eines objekts  -> d.h das erste Objekt der Klassencar wird erstellt
                                            // new 'klassenname'() sorgt für ein neues Objekt. Die Klammern symbolisieren den KONSTRUKTORAUFRUF
                                            // car1 ist eine Variable der Klasse KlassenCar

    car1.drive();                           // in KlasseCAr ist eine non-static_Methode die auf das instanziierte Objekt car1 angewandt werden kann
                                            // NON-STATIC Methoden sind nicht von außen abrufbar
    car1.setColor("Blau");
    car1.setBrand("Lamborghini");
    car1.setHorsePower(356);
        System.out.print(car1.getBrand()+", "+car1.getColor()+" mit "+ car1.getHorsePower()+" PS");
        System.out.println();

        KlasseCar car2 = new KlasseCar();
        car2.setColor("Rot");
        car2.setBrand("Ferrari");
        car2.setHorsePower(256);
        System.out.print(car2.getBrand()+", "+car2.getColor()+" mit "+ car2.getHorsePower()+" PS");
        System.out.println();*/

        KlasseCar car3= new KlasseCar("Schwarz","Mercedes", 654);
       // car3.setBrand("Mercedes");
       // car3.setColor("Schwarz");
       // car3.setHorsePower(301);
        System.out.print(car3.getBrand()+", "+car3.getColor()+" mit "+ car3.getHorsePower()+" PS");
        System.out.println();
        car3.drive(270);
        System.out.println();

        KlasseCar car4=new KlasseCar("Gelb", "Trabbi", 900);
        System.out.print(car4.getBrand()+", "+car4.getColor()+" mit "+ car4.getHorsePower()+" PS");
        System.out.println();
        car4.drive(304);
        System.out.println();

        KlasseCar car5 = new KlasseCar("Grau","BMW",888);
        System.out.print(car5.getBrand()+", "+car5.getColor()+" mit "+ car5.getHorsePower()+" PS");
        System.out.println();
        car5.drive(287);
        System.out.println();

        KlasseCar car6 =new KlasseCar("Rot","BMW", 5);
       System.out.print(car6.getBrand()+", "+car6.getColor()+" mit "+ car6.getHorsePower()+" PS");
        System.out.println();
    }
}
