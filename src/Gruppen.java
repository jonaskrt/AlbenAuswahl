
public class Gruppen {

    private String name;
    private Klasse[] klasse;
    private int klassenCount ;
    private final int Max_klasse = 15;

    public Gruppen() {
        klasse = new Klasse[Max_klasse];
        klassenCount = 0;
    }
    public void addKlasse(Klasse klassen) {
        klasse[klassenCount] = klassen;
        klassenCount++;
    }
    public void showKlasse() {
        for (int i = 0; i < klassenCount; i++) {
            System.out.println(i +" "+ klasse[i].getKlassenname());
        }
    }
    public String getName() {
        return name;
    }

    public Klasse getKlasse(int number) {
        if (number > klassenCount || number < 0) {
            System.out.println("Wert nicht gültig, bitte probieren Sie es erneut >");
            return null;
        } else {
            return klasse[number];
        }
    }

}
