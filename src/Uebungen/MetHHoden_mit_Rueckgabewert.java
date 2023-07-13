package Uebungen;

public class MetHHoden_mit_Rueckgabewert {
    public static void main(String[] args) {
        System.out.println("Vor Methodenaufruf");
        int resultDoSomething = doSomething(30,40);
        System.out.println(resultDoSomething);
       // System.out.println(doSomething(55,33));
        System.out.println("Nach Methodenaufruf");

    }
    public static int doSomething(int ja, int ganzgenau){
    int result =ja+ganzgenau;
        return result;
    }
}
