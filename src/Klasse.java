/**
 * short description of this program
 *
 * @author Sairam Vijayakumar
 * @version 1.0
 * @date 2020-06-16
 */

public class Klasse {

    private String name;
    private int schülerCntr;
    private int MAX_Schüler = 25;
    private Schüler[] schüler;
    private String schultag;


    public Klasse(String klassenname){
        this.name = klassenname;
        this.schultag = schultag;
        schüler = new Schüler[MAX_Schüler];
        schülerCntr = 0;
    }

    public String getKlassenname(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void addSchüler(Schüler schül) {
        schüler[schülerCntr] = schül;
        schülerCntr++;
    }

    public void showSchüler() {
        if (schülerCntr == 0) {
            System.out.println("Es wurden keine Schüler eingetragen.");
        } else {
            for (int i = 0; i < schülerCntr; i++) {
                System.out.println("«" + i + "»\t" + schüler[i].getName());
            }
        }
    }
    public String getName() {
        return name;
    }


}





