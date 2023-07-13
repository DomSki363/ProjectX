package Uebungen;

public class ArraySS {
    public static void main(String[] args) {


        String[] nameListe = new String[3]; // Größe des Arrays in int
      nameListe[0] = "Dom";
        nameListe[1] = "Tom";
        nameListe[2]   = "Jimmy";
 /*
        System.out.println(nameListe[2]);*/
        // über die nameListe.length können wir uns immer das ganze array anzeigen lassen, selbst wenn wir die Arraylänge im Code erweitern
        for(int i =0 ; i<nameListe.length; i++){
            System.out.println(nameListe[i]);
        }
    }
}