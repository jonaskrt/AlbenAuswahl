
public class App {

    Gruppen gruppe = new Gruppen();
    Einleser einleser = new Einleser();
    public App(){
            Gruppe();

        }

        public static void main(String[] args) {
            App app = new App();
            app.run();
        }


    public void run() {
        Einleser einleser = new Einleser();
        char menueAuswahl = ' ';

            while (menueAuswahl != 'x') {
                begrüssung();
                menueAuswahl = einleser.readChar();
                if (menueAuswahl == 'a') {
                    alleAnzeigen();
                } else if (menueAuswahl == 'b') {
                    klasseErstellen();
                } else if (menueAuswahl == 'c') {
                    schuelerErstellen();
                } else if (menueAuswahl == 'x') {
                    beenden();
                } else {
                    System.out.println("Ungültiger Befehl, bitte wählen Sie zwischen a, b, c oder x");
                }
                einleser.Line();
                System.out.println("'e' um wieder ins Hauptmenu zu gelangen");
                System.out.println("'x' um das Programm zu beenden");
                menueAuswahl = einleser.readChar();
            }
    }
        private void begrüssung() {
            String ausgabe = "Willkommen zum Gruppengenerator\n";
            ausgabe += "Wählen Sie unter folgenden Optionen:\n";
            ausgabe += "'a' um Klasse inkl. Schüler anzuzeigen\n";
            ausgabe += "'b' um eine neue Klasse einzutragen\n";
            ausgabe += "'c' um einen neuen Schüler  einzutragen\n";
            ausgabe += "'x' um das Programm zu beenden\n";
            System.out.println(ausgabe);
        }
    public void alleAnzeigen(){
        System.out.println("Wählen Sie eine Klasse aus >");
         gruppe.showKlasse();
         Klasse klasse = gruppe.getKlasse(einleser.readInt());

         klasse.showSchüler();
    }
    public void klasseErstellen(){
        System.out.println("Unter welchen Namen sollte die Klasse gespeichert werden? >");
        einleser.Line();
        String name = einleser.readString();
        Klasse newKlasse = new Klasse(name);

        gruppe.addKlasse(newKlasse);
        einleser.Line();
        System.out.println("Die Klasse "+ newKlasse.getName() + " wurde erstellt");
    }

    public void schuelerErstellen(){
        System.out.println("Wählen Sie die Klasse, wo der Schüler eingetragen werden soll >");
        gruppe.showKlasse();
        Klasse klasse = gruppe.getKlasse(einleser.readInt());

        System.out.println("Sie haben die Klasse "+ klasse.getName() + " gewählt");
        einleser.Line();
        System.out.println("Nun geben Sie den Vornamen des Schülers ein >");
        einleser.Line();
        String vorname1 = einleser.readString();
        einleser.Line();
        System.out.println("Und jetzt der Nachname >");
        einleser.Line();
        String nachname1 = einleser.readString();
        Schüler newSchüler = new Schüler(vorname1,nachname1);
        einleser.Line();
        klasse.addSchüler(new Schüler(vorname1,nachname1));


        System.out.println("Der neue Schüler wurde unter "+ newSchüler.getName() + " in der Klasse "+ klasse.getName() + " gespeichert");

    }



    public void Gruppe() {

        Klasse kl1 = new Klasse("I1a");

        kl1.addSchüler(new Schüler("Jonas", "Rhbary"));
        kl1.addSchüler(new Schüler("Arbias", "Imeri"));
        kl1.addSchüler(new Schüler("Isuf", "Hasani"));
        kl1.addSchüler(new Schüler("Kevin", "Bertolini"));
        kl1.addSchüler(new Schüler("Sven", "Wildhaber"));
        kl1.addSchüler(new Schüler("Yannis", "Lee"));

        Klasse kl2 = new Klasse("I1b");

        kl2.addSchüler(new Schüler("Saam", "Eymany"));
        kl2.addSchüler(new Schüler("Nils", "Iseli"));
        kl2.addSchüler(new Schüler("Leon", "Lopetrone"));
        kl2.addSchüler(new Schüler("Danial", "Vaezi"));
        kl2.addSchüler(new Schüler("Sairam", "Vijayakumar"));

        gruppe.addKlasse(kl1);
        gruppe.addKlasse(kl2);



    }
    public void beenden(){
        System.exit(0);
    }


}








