package Uebungen;

public class KlasseCar {
// Die ganze class Klassencar ist mit Attributen und Mewthoden 'gefüttert'
    // Attribute/Eigenschaften
    //      - Ein Attribut wird dazu verwendet eine Klasse zu umschreiben
    //      - Durch SICHTBARKEITMODIFIZIERER unterscheiden sich Attribute von gewöhnlichen Variablen
    //      - SICHTBARKEITMODIFIZIERER regeln die Zugriffsberechtigung von außen


    //   ATTRIBUTE NICHT AUF PUBLIC !!!
    //   Getter und setter Methoden innerhalb für kontrollierten umgang mit den Atributen
private String color;
private String brand;
private int horsePower;
 public KlasseCar(String color,String brand,int horsePower){
     this.color=color;
     this.brand=brand;
     this.horsePower=horsePower;
 }
/*  SETTER
* Zugriffe auf die Attribute können hier definiert werden das heißt :
*       - if Abfrage um z.B. nur bestimmte Farben einzutragen
*       - Notifikation erhalten und Errors anzeigen lassen
*   daran erlangt man die Kontrolle über die Attribute und sorgt dafür das nur richtige werte an der Richtigen Stelle stehen
*/



// getter und setter erstellen mithilfe von generate!! aufbau ist immer wie folgend:
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    // Methoden
public void drive(int speed) {

    System.out.println("Das Auto fährt "+speed +" KM/h");

    // ÜBERLADUNGGEN
    /*
Es besteht die Möglichkeit eine Methode zu überladen. Wenn wir eine Methode mit Parameterübergabe erstellen verlangt diese
das die Parameter übergeben werden und kann sonst nicht ausgeführt werden.
Wenn wir die gleiche Methode MIT UND OHNE Parameter erstellen schaffen wir dem client die Möglichkeit
bekannte Werte zu übergeben.
Das System unterscheidet selbsständig welche Methode aufgerufen wird über die gegebenen Parameter.
    ---> Hier spricht man von VERSCHIEDENEN SIGNATUREN.
         Das bedeutet das wir eine gleichnamige Methode mit verschiedenen Parametern füllen können und das
         System weiß anhand der erforderlichen Parameter welche Methode gerade angesprochen wird.
Signaturen beziehen sich auf Reihenfolge und Datentypen !!!!
     */

}
}
