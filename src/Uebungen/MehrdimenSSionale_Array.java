package Uebungen;

public class MehrdimenSSionale_Array {
    // Datensammlung, ein eindimensionales array ist mit einer Liste zu vergleichen, ein mehr diemsionales arrays gleicht einer Tabelle (Zeilen und Spalten)
    public static void main(String[] args) {


    String[][] firstandlastname = new String[5][2];
    firstandlastname[0][0]= "Dom";
    firstandlastname[0][1]= "Boozle";

        firstandlastname[1][0]= "Tom";
        firstandlastname[1][1]= "Booz";

        firstandlastname[2][0]= "John";
        firstandlastname[2][1]= "Bole";

        firstandlastname[3][0]= "Jim";
        firstandlastname[3][1]= "Bob";

        firstandlastname[4][0]= "Bobby";
        firstandlastname[4][1]= "Jim";

        // Äußere ForSchleife : Zeilenindex = i
        // Innere Forschleife : Spaltenindex = j
        for(int i =0; i< firstandlastname.length; i++)
        // hier wird angesprochen wieviele Zeilen (untereinander) gezählt werden
        {

            {for(int j =0 ; j< firstandlastname[i].length;j++ )
                // hier wird angegeben wieviele Spalten innerhalb der Zeilen angegeben werden
                System.out.print(firstandlastname[i][j]+ " ");
            }
           // System.out.print(",");
           System.out.println();
        }
}
}