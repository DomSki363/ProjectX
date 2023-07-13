package Uebungen;

public class ForeachSSchleife {
    // nur lesender Zugriff
    public static void main(String[] args) {


    String[]names ={"Dom","Tom","John"};
    for(int i=0; i<names.length; i++){
        System.out.println(names[i]);
}

    // es wird lediglich eine kopie des Wertes im Array angezeigt. Keine deklaration innerhalb möglich
    for(String name : names){
        System.out.println(name);
    }
 }
}