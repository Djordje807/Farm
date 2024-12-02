
package project;

import java.util.Scanner;

/**
 *
 * @author korisnik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Farma f = new Farma();
Zivotinje z  = new Zivotinje();

        f.UcitajFarmu();
        System.out.println("");
        f.PrikaziFarmu();
        System.out.println("");
        f.DodajFarmu();
        
        System.out.println("");
        
        z.ucitajZivotinju();
        System.out.println("");
        z.prizaziZivotinju();
        
        
    }
}
        
        