package Uebungen;

public class MetHHoden {
    // Eine Methode ist ein Stück vorprogrammierter Code den wir immer ausführen können ohne diesen neu schreiben zu müssen
    public static void main(String[] args) {
        System.out.println("Vor dem Methodenaufruf");
        doSSomething(33,55);
        System.out.println("Nach dem Methodenaufruf");

    }
    public static void doSSomething(int numb1, int numb2){
        // einer leere Klammer hinter der Methode bedeutet das keine PARAMETERÜbergabe erfolgt. Das bedeutet das
        // nur die in der methode festgelegeten Daten genutzt werden. Wenn ich in der Methode Parameter deklariere
        // muss ich sie im Methodenaufruf füllen sonst Fehler.



      //  int x = numb1 ;
      //  int y = numb2;
        int result = numb1+numb2;
        System.out.println(result);
    }
}
